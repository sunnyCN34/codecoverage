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
      //  bw.write("<textarea cols=120 rows=30>")
      //  bw.close();
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
		List<FileInfo> fileInfos = fileInfoService.getFileInfosByModelPath(modelPath,true);
	   
	    
		fileInfos = fileInfoService.populateFunctionsOnFileInfo(fileInfos);
		
		File file = new File("/Users/ten24user/git/codecoverage/htmlOutput.html");
		
		   
        BufferedWriter bbw = new BufferedWriter(new FileWriter(file,true));
        bbw.write("</table>");
        bbw.write("<p>"+"OVERALL REPORT FOR CODE COVERAGE"+"</p>");
       
    
		ExtractFunctionTool b1= new ExtractFunctionTool();
		int totalFunctions=b1.totalNumberOfFunction;
		System.out.println("\nTotal number of functions in all the parsed files= "+totalFunctions);
		bbw.write("<p>"+"Total number of functions in all the parsed files= "+ Integer.toString(totalFunctions)+"</p>");
		
		FileInfo b2= new FileInfo();
		int totalMatches=b2.totalNumberOfMatchesInAllFiles;
		
		System.out.println("Total number of tested functions in all the files= "+totalMatches);
		bbw.write("<p>"+"Total number of tested functions in all the files= "+ Integer.toString(totalMatches)+"</p>");
		
		int totalCoverage= (totalMatches*100)/totalFunctions;
		
		System.out.println("\nTotal percentage of coverage we have for Slatwall is= "+totalCoverage+"%");
		 bbw.write("<p>"+"Total percentage of coverage we have for Slatwall is= "+Integer.toString(totalCoverage)+"%"+"<p>");
	       
	//	 bbw.write("\n\n\t\t<-------------------------------THE END--------------------------------->");
		 
		 //   bbw.write("</textarea>");
	        bbw.write("</body>");
	        bbw.write("</html>");

	        
	        bbw.close();

		
	}
}