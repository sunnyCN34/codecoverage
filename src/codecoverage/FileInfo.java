package codecoverage;

import java.io.*;
import java.util.*;



public class FileInfo{
	File file;
	List<String> functions;
	File testFile;
	boolean testFileExists=false;
	int functionsTested=0;
	//HashMap<String,>
	
	
	FileInfo(File file){
		
		this.file = file;
		
		
		
	}
	
	public int getFunctionsCount(){
		return this.functions.size();
	}
	
	void populateTestFile(){
		String slatwallDirectory = this.file.getAbsolutePath().split("model")[0];
		
		String relativePath = this.file.getAbsolutePath().split("model")[1];
		
		String beginningString = relativePath.split("\\.")[0];
		String testFilePath = slatwallDirectory+"meta/tests/unit"+beginningString+"Test.cfc";
		this.testFile = new File(testFilePath);
		System.out.println("testing:"+file.getName());
		System.out.println("exists:"+testFile.exists());
		this.testFileExists = testFile.exists();
		
	}
	
}
