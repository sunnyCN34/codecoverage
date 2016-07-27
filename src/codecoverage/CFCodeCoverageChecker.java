package codecoverage;

import java.io.*;
import java.util.*;


public class CFCodeCoverageChecker {
	//FileInfo b1= new FileInfo();
	
	List<FileInfo> fileInfos;static int count =0;
	
	static FileInfoService fileInfoService = ServiceFactory.getFileInfoService();
	
	public static void main(String[] args) throws Exception,FileNotFoundException, IOException{
		
		System.out.println("This is the main section ");
		
		//STEP 1: be able to pass Slatwall directory as an argument from command line
		
		String slatwallDirectoryPath = args[0];
	
		String modelPath = slatwallDirectoryPath.concat("/model/");
		modelPath.replaceAll("/", File.separator);
		System.out.println(modelPath);
	
		fileInfoService.createHtmlFileAndTableHeads();
		List<FileInfo> fileInfos = fileInfoService.getFileInfosByModelPath(modelPath,true);
	   
	    
		fileInfos = fileInfoService.populateFunctionsOnFileInfo(fileInfos);
	    fileInfoService.getCompleteOverallReportOfCoverage();

		
	}
}