package codecoverage;

import java.io.*;
import java.util.*;



public class FileInfo{
	File file;
	List<String> functions;
	File testFile;
	
	//HashMap<String,>
	
	
	FileInfo(File file){
		
		this.file = file;
		
		
		
	}
	
	void test(){
		for(int i=0; i < this.functions.size(); i++){
			String functionName = this.functions.get(i);
			
			String slatwallDirectory = this.file.getAbsolutePath().split("model")[0];
			System.out.println(slatwallDirectory);
			String relativePath = this.file.getAbsolutePath().split("model")[1];
			System.out.println(relativePath);
			String beginningString = relativePath.split("\\.")[0];
			String testFilePath = slatwallDirectory+"meta/tests/unit"+beginningString+"Test.cfc";
			this.testFile = new File(testFilePath);
			System.out.println("exists:"+testFile.exists());
		}
	}
	
}
