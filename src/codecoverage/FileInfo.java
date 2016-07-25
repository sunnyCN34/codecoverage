package codecoverage;

import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.BaseErrorListener;

public  class FileInfo{
	File file;
	static List<String> functions = new ArrayList<String>();
	List<String> callfunctionNames = new ArrayList<String>();
	File testFile;
	boolean testFileExists=false;
	int functionsTested=0;
	
	int a=0;
	
	static int totalNumberOfMatchesInAllFiles=0;
	public static String testFilePath;
	FileInfo(File file){
		
		this.file = file;	
		
	}
	public FileInfo(){}
	public void getReportOfTestedFunction() throws IOException{
		int numberOfDeclaredFunctions= functions.size();
		int numberOfFunctionCalls= callfunctionNames.size();
		int numberOfMatchedFunctions=0;
		
		for(int i=0; i<numberOfDeclaredFunctions; i++)
		{
			
			for(int j=0;j<numberOfFunctionCalls;j++)
			{
				
				if(callfunctionNames.get(j).equals(functions.get(i)))
				{
				   numberOfMatchedFunctions ++;
				   totalNumberOfMatchesInAllFiles++;
				}
			}
		}
		int percentage= (numberOfMatchedFunctions*100)/ numberOfDeclaredFunctions;
		
	    File fc = new File("/Users/ten24user/git/codecoverage/htmlOutput.html");
	   
        BufferedWriter bw = new BufferedWriter(new FileWriter(fc,true));
  //      bw.write("<table>");
 
        bw.write("<tr>");
        
        bw.write("<td>"+file.getName()+"</td>");
        bw.write("<td>"+Boolean.toString(testFile.exists())+"</td>");
        bw.write("<td>"+Integer.toString(numberOfMatchedFunctions)+"</td>");
        bw.write("<td>"+Integer.toString(numberOfDeclaredFunctions)+"</td>");
        bw.write("<td>"+Integer.toString(numberOfFunctionCalls)+"</td>");
        if(percentage<=100){
        bw.write("<td>"+Integer.toString(percentage)+"</td>");
        }
        else{
        	bw.write("<td>"+"100"+"</td>");
        }
        bw.write("</tr>");
    //    bw.write("</table>");
	    
		System.out.println("Total declared function= "+numberOfDeclaredFunctions+"  Total number of function calls= "+numberOfFunctionCalls+"  Total tested function= "+numberOfMatchedFunctions);
		
/*		if(percentage>100)// if function is called more than once. 
		{
			bw.write("\n\nPERCENTAGE OF TESTED FUNCTION IN THIS FILE= 100%");
			System.out.println("PERCENTAGE OF TESTED FUNCTION IN THIS FILE= 100%"+"(You called few functions more than once in test file for this component)");
			bw.write("\n\n<----------------------------------------------------------------------------------------->");
			bw.close();
		}
		else if(percentage<=100){*/
	//	bw.write("\n\nPERCENTAGE OF TESTED FUNCTION IN THIS FILE= "+Integer.toString(percentage)+"%");
		System.out.println("PERCENTAGE OF TESTED FUNCTION IN THIS FILE= "+percentage+"%");
		//bw.write("\n\n<----------------------------------------------------------------------------------------->");
		bw.close();		
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
		return functions.size();
	}
	
	void populateTestFile() throws IOException{
		String slatwallDirectory = this.file.getAbsolutePath().split("model")[0];
		
		String relativePath = this.file.getAbsolutePath().split("model")[1];
		
		String beginningString = relativePath.split("\\.")[0];
		testFilePath = slatwallDirectory+"meta/tests/unit"+beginningString+"Test.cfc";
		this.testFile = new File(testFilePath);
		
		File fz = new File("/Users/ten24user/git/codecoverage/htmlOutput.html");
		   
        BufferedWriter bw = new BufferedWriter(new FileWriter(fz,true));
       // bw.write("<table>");
       //   bw.write("<tr>");
     //   bw.write("<td>"+"Testing"+"</td>");
      //  bw.write("<td>"+"Test File Present For"+file.getName()+"</td>");
      //  bw.write("</tr>");
       // bw.write("<tr>");
        
     //   bw.write("<td>"+file.getName()+"</td>");
       // bw.write("<td>"+Boolean.toString(testFile.exists())+"</td>");
     
  
    //    bw.write("</tr>");
   //     bw.write("</table>");
     //   bw.write("<----------------------------------------------------------------------------------------->");
    //    bw.write("\n\n\n\n\nTesting: "+file.getName());
    //    bw.write("\t \t Test File Present For "+file.getName()+": "+ Boolean.toString(testFile.exists()));
		System.out.println("testing: "+file.getName());
		System.out.println("exists: "+testFile.exists());
		this.testFileExists = testFile.exists();
		bw.close();
	}
	public static String Name(){
		return testFilePath;
	}
	public static int getFunctionCounter(){
		System.out.println("Function Names: " + functions.toString());
		return functions.size();}
}
