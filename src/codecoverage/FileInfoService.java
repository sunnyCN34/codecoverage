package codecoverage;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class FileInfoService{
	
	public List<FileInfo> getFileInfosByModelPath(String modelPath, boolean useFilter){
		List<FileInfo> fileInfos = new ArrayList<FileInfo>();
		
		File[] listOfModelFolders= this.getFoldersByModelPath(modelPath,useFilter);
		
		fileInfos = this.getFileInfosByModelFolders(listOfModelFolders);
		
		return fileInfos;
	}
	
	public FileInfo getFileInfoByFile(File file){
		FileInfo fileInfo = new FileInfo(file);
		
		return fileInfo;
	}
	
	int totalFunctions=0; int finalTotalFunctions=0; int finalMatchedFunctions=0;
	
	public List<FileInfo> populateFunctionsOnFileInfo(List<FileInfo> fileInfos){
		//iterate over the fileInfo objects and parse the files to get functions
		for(int i=0; i < fileInfos.size(); i++){
			FileInfo fileInfo = fileInfos.get(i);
			try{
				//parse testable files
				InputStream fileInputStream = new FileInputStream(fileInfo.file);
				ANTLRInputStream input = new ANTLRInputStream(fileInputStream);
				CFSCRIPTLexer lexer = new CFSCRIPTLexer(input);
				lexer.removeErrorListeners();
				//lexer.addErrorListener(new error());
				
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				CFSCRIPTParser parser = new CFSCRIPTParser(tokens);
				ParseTree tree = parser.componentDeclaration();
				
				
		        parser.removeErrorListeners();
		     

				ParseTreeWalker walker = new ParseTreeWalker();
				
				ExtractFunctionTool listener = new ExtractFunctionTool();
				
				walker.walk(listener,tree);
				totalFunctions= listener.totalNumberOfFunction;
				//last=totalFunctions;
				finalTotalFunctions=finalTotalFunctions+totalFunctions;
		//		 System.out.println("\nThis is the value you need to experiment with="+totalFunctions+" last="+finalTotalFunctions);
				fileInfo.functions = listener.functionNames;
		//		System.out.println("function name= "+fileInfo.functions.toString());
				fileInfo.populateTestFile();
				//check if functions are being testing in test files
				if(fileInfo.testFile.exists()){
				InputStream testFileInputStream = new FileInputStream(fileInfo.testFile);
				ANTLRInputStream testinput = new ANTLRInputStream(testFileInputStream);
				
				CFSCRIPTLexer testLexer = new CFSCRIPTLexer(testinput);
				
				testLexer.removeErrorListeners();
				//testLexer.addErrorListener(new error());
				
				CommonTokenStream testTokens = new CommonTokenStream(testLexer);
				CFSCRIPTParser testParser = new CFSCRIPTParser(testTokens);
				ParseTree testTree = testParser.componentDeclaration();
				
				ParseTreeWalker testWalker = new ParseTreeWalker();
				ExtractFunctionCallTool testListener = new ExtractFunctionCallTool(fileInfo);
				
		        testParser.removeErrorListeners();
		        //testParser.addErrorListener(new error());
				
				testWalker.walk(testListener,testTree);
				fileInfo.getReportOfTestedFunction();
				finalMatchedFunctions=finalMatchedFunctions+fileInfo.totalNumberOfMatchesInAllFiles;
				System.out.println("This value="+finalMatchedFunctions);
				}
				//fileInfo.getReportOfTestedFunction();
				else
				{
					File fk = new File("htmlOutput.html");
					   
			        BufferedWriter bw = new BufferedWriter(new FileWriter(fk,true));
			       // bw.write("\n\nTest file not found. Hence percentage of coverage is zero.");
			      //  bw.write("\n\n<----------------------------------------------------------------------------------------->");
			        bw.write("<tr>");
			        
			        bw.write("<td>"+fileInfo.file.getName()+"</td>");
			        bw.write("<td>"+Boolean.toString(fileInfo.testFile.exists())+"</td>");
			        bw.write("<td>"+"0"+"</td>");
			        bw.write("<td>"+"0"+"</td>");
			        bw.write("<td>"+"0"+"</td>");
			        
			        bw.write("<td>"+"0%"+"</td>");
			       
			        bw.write("</tr>");
			   //     bw.write("</table>");
			        bw.close();
					System.out.println("Test file not found. Hence percentage of coverage is zero.");
				} 
				
			}catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            System.err.println(fileInfo.file.getName());
	        }
		
		}
		
		return fileInfos;
	}
	
	public List<FileInfo> getFileInfosByModelFolders(File[] modelFolders){
		List<FileInfo> fileInfos = new ArrayList<FileInfo>();
		for (int i = 0; i < modelFolders.length; i++) {
			
	      if (modelFolders[i].isFile()) {
	        if(modelFolders[i].getName().indexOf(".cfm") >= 0 || modelFolders[i].getName().indexOf(".cfc") >= 0 ){
	        	//if we hit a file than we can inspect and create some fileinfo
		        FileInfo fileInfo = this.getFileInfoByFile(modelFolders[i]);
		        fileInfos.add(fileInfo);
	        }
	        
	      } else if (modelFolders[i].isDirectory()) {
	        //if we are in a folder than recurse til we hit a file
	    	
	        String folderPath = modelFolders[i].getAbsolutePath();
	       
	        List<FileInfo> fileInfoForFolder = this.getFileInfosByModelPath(folderPath,false);
	        fileInfos.addAll(fileInfoForFolder);
	      }
	    }
		return fileInfos;
	}
	
	public File[] getFoldersByModelPath(String modelPath){
		return this.getFoldersByModelPath(modelPath, false);
	}
	
	public File[] getFoldersByModelPath(String modelPath,  boolean useFilter){
		List<FileInfo> fileInfos = new ArrayList<FileInfo>();
		File modelFolder = new File(modelPath);
		//FileNameFilter fileNameFilter = ["entity","dao","process","transient","service"];
		
		if(useFilter){
			FilenameFilter textFilter = new FilenameFilter() {
				
				public boolean accept(File dir, String name) {
					String lowercaseName = name.toLowerCase();
					//entity,transient,process,service,dao
					return "entity".contains(lowercaseName);
				}
			};
			
			return modelFolder.listFiles(textFilter);
		}else{
			return modelFolder.listFiles();
		}
		
		
	}
	public void getCompleteOverallReportOfCoverage() throws Exception{
		File file = new File("htmlOutput.html");
		
		   
        BufferedWriter bbw = new BufferedWriter(new FileWriter(file,true));
        bbw.write("</table>");
        bbw.write("<p>"+"OVERALL REPORT FOR CODE COVERAGE"+"</p>");
       
       int totalFunctions=0;
//        //Compilation error not allowed
// obj = SingletonClass.getSingletonObject();
  //     FileInfoService fileInfoService = ServiceFactory.getFileInfoService();
	//	 totalFunctions=fileInfoService.totalNumberOfFunction;
       // int totalfunctions=ExtractFunctionTool.totalNumberOfFunction;
		 

	//		ExtractFunctionTool listener = new ExtractFunctionTool();
	//		totalFunctions= listener.totalNumberOfFunction;
		// System.out.println("\nThis is the value you need to experiment with="+totalFunctions);
		System.out.println("\nTotal number of functions in all the parsed files= "+finalTotalFunctions);
		bbw.write("<p>"+"Total number of functions in all the parsed files= "+ Integer.toString(finalTotalFunctions)+"</p>");
		
	
	//	int totalMatches=FileInfo.totalNumberOfMatchesInAllFiles;
		
		System.out.println("Total number of tested functions in all the files= "+finalMatchedFunctions);
		bbw.write("<p>"+"Total number of tested functions in all the files= "+ Integer.toString(finalMatchedFunctions)+"</p>");
		
		int totalCoverage= (finalMatchedFunctions*100)/finalTotalFunctions;
		
		System.out.println("\nTotal percentage of coverage we have for Slatwall is= "+totalCoverage+"%");
		 bbw.write("<p>"+"Total percentage of coverage we have for Slatwall is= "+Integer.toString(totalCoverage)+"%"+"<p>");
	       
	
	        bbw.write("</body>");
	        bbw.write("</html>");

	        
	        bbw.close();

	}
	public void createHtmlFileAndTableHeads() throws Exception{

        File f = new File("htmlOutput.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
       
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<h1>Report For Code Coverage In Slatwall</h1>");
     
        bw.write("<table>");
        bw.write("<thead>");
        bw.write("<tr>");
        bw.write("<th>"+"Testing"+"</th>");
        bw.write("<th>"+"Test File Present"+"</th>");
        bw.write("<th>"+"Total Declared Function"+"</th>");
        bw.write("<th>"+"Total number of function calls"+"</th>");
        bw.write("<th>"+"Total Tested function"+"</th>");
        bw.write("<th>"+"Total Percentage Of Coverage For This File"+"</th>");
        bw.write("</tr>");
        bw.write("</thead>");
        bw.close();
	}
}
