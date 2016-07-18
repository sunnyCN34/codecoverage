package codecoverage;

import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.BaseErrorListener;



public class FileInfo{
	File file;
	List<String> functions= new ArrayList<String>();
	List<String> callfunctionNames = new ArrayList<String>();
	File testFile;
	boolean testFileExists=false;
	int functionsTested=0;
	//HashMap<String,>
	
	public static String testFilePath;
	FileInfo(File file){
		
		this.file = file;	
		
	}
	public void getReportOfTestedFunction(){
		int numberOfDeclaredFunctions= functions.size();
		int numberOfFunctionCalls= callfunctionNames.size();
		int numberOfMatchedFunctions=0;
		for(int i=0; i<numberOfDeclaredFunctions; i++)
		{
			
			for(int j=0;j<numberOfFunctionCalls;j++)
			{
				//System.out.println("declared= "+functions.get(i)+" called function= "+callfunctionNames.get(j));
				if(callfunctionNames.get(j).equals(functions.get(i)))
				{
				   numberOfMatchedFunctions ++;
				}
			}
		}
System.out.println("Total declared function= "+numberOfDeclaredFunctions+" Total number of function calls= "+numberOfFunctionCalls+" Total tested function= "+numberOfMatchedFunctions);
		int percentage= (numberOfMatchedFunctions*100)/ numberOfDeclaredFunctions;
	System.out.println("PERCENTAGE OF TESTED FUNCTION= "+percentage);
		
		
	}
/*	public int getReportOfTestedFunction(){
		int numberOfDeclaredFunctions= functions.size();
		int numberOfFunctionCalls= callfunctionNames.size();
		HashSet<String> myFunctionCallSet = new HashSet<>(callfunctionNames);
		HashSet<String> myFunctionSet = new HashSet<>(functions);
		HashSet<String> intersection = new HashSet<>();
		Iterator<String> functionIt = myFunctionCallSet.iterator();
		int count = 0;
		//All matches could be
		System.out.println(myFunctionSet.toString());
		while (functionIt.hasNext()){
			String current = functionIt.next();
			System.out.println("Currrent is " + current );
			
			if (myFunctionSet.contains(current)){
				//found match.
				count++;
				
			}
		}
		System.out.println(""+count);
		//myHashSet.
		//Two sets
		//get an iterator on set 1.  keep calling next and checking if the other has it.
		
		
	//System.out.println("Total declared function= "+numberOfDeclaredFunctions+" Total number of function calls= "+numberOfFunctionCalls+" Total tested function= "+numberOfMatchedFunctions);
	//	int percentage= (numberOfMatchedFunctions*100)/ numberOfDeclaredFunctions;
//	System.out.println(""+percentage);
		return count;  
	}
	*/
	public int getFunctionsCount(){
		return this.functions.size();
	}
	
	void populateTestFile(){
		String slatwallDirectory = this.file.getAbsolutePath().split("model")[0];
		
		String relativePath = this.file.getAbsolutePath().split("model")[1];
		
		String beginningString = relativePath.split("\\.")[0];
		testFilePath = slatwallDirectory+"meta/tests/unit"+beginningString+"Test.cfc";
		this.testFile = new File(testFilePath);
		System.out.println("testing:"+file.getName());
		System.out.println("exists:"+testFile.exists());
		this.testFileExists = testFile.exists();
		
	}
	public static String Name(){
		return testFilePath;
	}
	
}
