package codecoverage;

import java.io.*;
import java.util.*;


public class CFCodeCoverageChecker {
	//FileInfo b1= new FileInfo();
	
	List<FileInfo> fileInfos;static int count =0;
	
	static FileInfoService fileInfoService = ServiceFactory.getFileInfoService();
	
	public static void main(String[] args) {
		
		System.out.println("This is the main section ");
		
		//STEP 1: be able to pass Slatwall directory as an argument from command line
		
		String slatwallDirectoryPath = args[0];
		
		//STEP 2: read all file names in /model folder store info in an array of file objects 
		//		  [
		//			{
		//				filename:"Product.cfc",
		//				path:"/entity"
		//				functions:["getAvailableForPurchaseFlag","..."]
		//			}
		//		  ] 
		//l
		String modelPath = slatwallDirectoryPath.concat("/model/");
		modelPath.replaceAll("/", File.separator);
		System.out.println(modelPath);
		List<FileInfo> fileInfos = fileInfoService.getFileInfosByModelPath(modelPath,true);
		System.out.println(""+fileInfos);
		//STEP 3: check for equivalent test files in /meta/tests/unit{{file.path}}/{{file.filename}}
		fileInfos = fileInfoService.populateFunctionsOnFileInfo(fileInfos);
		
		ExtractFunctionTool b1= new ExtractFunctionTool();
		int totalFunctions=b1.totalNumberOfFunction;
		System.out.println("Total number of functions in all the parsed files= "+totalFunctions);
		FileInfo b2= new FileInfo();
		int totalMatches=b2.totalNumberOfMatchesInAllFiles;
		System.out.println("Total number of tested functions in all the files= "+totalMatches);
		int totalCoverage= (totalMatches*100)/totalFunctions;
		System.out.println("Total percentage of coverage we have for Slatwall is= "+totalCoverage+"%");
		
		
	/*	count = count + FileInfo.getFunctionCounter();
		System.out.println(FileInfo.getFunctionCounter());
		System.out.println("counter="+count);*/
		
		
		
//		System.out.println(testPath2);
//		List<FileInfo> testFilesInfo;
//		testFilesInfo= fileInfoService.getFileInfosByModelPath(testPath2, true);
//		System.out.println(""+testFilesInfo);
		//Store in an array of testfiles with keys filename and path as well.
		
		//STEP 4: parse test files and verify function is being tested
		
	}
}