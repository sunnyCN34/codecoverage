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
				
				fileInfo.functions = listener.functionNames;
				
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
				}
				//fileInfo.getReportOfTestedFunction();
				else
				{
					File fk = new File("/Users/ten24user/git/codecoverage/htmlOutput.html");
					   
			        BufferedWriter bw = new BufferedWriter(new FileWriter(fk,true));
			       // bw.write("\n\nTest file not found. Hence percentage of coverage is zero.");
			      //  bw.write("\n\n<----------------------------------------------------------------------------------------->");
			        bw.write("<tr>");
			        
			        bw.write("<td>"+fileInfo.file.getName()+"</td>");
			        bw.write("<td>"+Boolean.toString(fileInfo.testFile.exists())+"</td>");
			        bw.write("<td>"+"0"+"</td>");
			        bw.write("<td>"+"0"+"</td>");
			        bw.write("<td>"+"0"+"</td>");
			        
			        bw.write("<td>"+"0"+"</td>");
			       
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
}
