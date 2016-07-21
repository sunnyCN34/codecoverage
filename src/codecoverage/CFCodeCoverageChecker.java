package codecoverage;

import java.io.*;
import java.util.*;


public class CFCodeCoverageChecker {
	//FileInfo b1= new FileInfo();
	
	List<FileInfo> fileInfos;static int count =0;
	
	static FileInfoService fileInfoService = ServiceFactory.getFileInfoService();
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("This is the main section ");
		
		//STEP 1: be able to pass Slatwall directory as an argument from command line
		
		String slatwallDirectoryPath = args[0];
	
		String modelPath = slatwallDirectoryPath.concat("/model/");
		modelPath.replaceAll("/", File.separator);
		System.out.println(modelPath);
		

        File f = new File("htmlOutput.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
       
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<h1>Report For Code Coverage In Slatwall</h1>");
      //  bw.write("<textarea cols=120 rows=30>");
		
		
		
        bw.close();
		List<FileInfo> fileInfos = fileInfoService.getFileInfosByModelPath(modelPath,true);
	   
	    
		fileInfos = fileInfoService.populateFunctionsOnFileInfo(fileInfos);
		
		File file = new File("/Users/ten24user/git/codecoverage/htmlOutput.html");
		   
        BufferedWriter bbw = new BufferedWriter(new FileWriter(file,true));
        bbw.write("\n\n\n\n\t\t\t\tOVERALL REPORT FOR CODE COVERAGE");
       
    
		ExtractFunctionTool b1= new ExtractFunctionTool();
		int totalFunctions=b1.totalNumberOfFunction;
		System.out.println("\nTotal number of functions in all the parsed files= "+totalFunctions);
		bbw.write("\n\nTotal number of functions in all the parsed files= "+ Integer.toString(totalFunctions));
		
		FileInfo b2= new FileInfo();
		int totalMatches=b2.totalNumberOfMatchesInAllFiles;
		
		System.out.println("Total number of tested functions in all the files= "+totalMatches);
		bbw.write("\nTotal number of tested functions in all the files= "+ Integer.toString(totalMatches));
		
		int totalCoverage= (totalMatches*100)/totalFunctions;
		
		System.out.println("\nTotal percentage of coverage we have for Slatwall is= "+totalCoverage+"%");
		 bbw.write("\n\nTotal percentage of coverage we have for Slatwall is= "+Integer.toString(totalCoverage)+"%");
	       
		 bbw.write("\n\n\t\t<-------------------------------THE END--------------------------------->");
		 
		 //   bbw.write("</textarea>");
	        bbw.write("</body>");
	        bbw.write("</html>");

	        
	        bbw.close();

		
	}
}