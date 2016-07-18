package codecoverage;

import java.io.*;
import java.util.*;


public class ExtractFunctionCallTool extends CFSCRIPTParserBaseListener {
	FileInfo fileInfo;
	
	
	ExtractFunctionCallTool(FileInfo _fileInfo){
		this.fileInfo = _fileInfo;
	}
	
	
	@Override
	public void enterFunctionCall(CFSCRIPTParser.FunctionCallContext ctx) {
		String value="";
		String testFunctionBeingCalled = ctx.getText();
		for(int i=0; i<testFunctionBeingCalled.length(); i++)
		{
			char a= testFunctionBeingCalled.charAt(i);
			if(a != '('){
				value= value+a;
			}
			else if(a == '('){
				break;
			}
			
		}
		fileInfo.callfunctionNames.add(value);
		//System.out.println(fileInfo.callfunctionNames);
		//String splited[]= testFunctionBeingCalled.split("(");
		//System.out.println(splited[1]);
			//fileInfo.callfunctionNames.add(testFunctionBeingCalled);
		
//		if(callfunctionNames.size()>0)
//		System.out.println("It has functions");
		//System.out.println(callfunctionNames);
		
		
		
		/*String testFunctionBeingCalled = ctx.getText().split("(")[0];
		if(this.fileInfo.functions.indexOf(testFunctionBeingCalled) >= 0){
			System.out.println("foundFunctionBeingTested");
			//increment functions tested
			this.fileInfo.functionsTested++;
			
		
	//	}
		
		//System.out.println("test");
		
		//functionNames.add(ctx.identifier().getText());    */
	
	
	}}
	
