package codecoverage;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class ExtractFunctionCallTool extends CFSCRIPTParserBaseListener {
	FileInfo fileInfo;
	
	
	ExtractFunctionCallTool(FileInfo _fileInfo){
		this.fileInfo = _fileInfo;
	}
	
	
	@Override
	public void enterFunctionCall(CFSCRIPTParser.FunctionCallContext ctx) {
		String value="";
		String testFunctionBeingCalled = ctx.getText();
		value = testFunctionBeingCalled.split(Pattern.quote("("))[0];
		
		//System.out.println(""+counterChamp);
		fileInfo.callfunctionNames.add(value);
		//System.out.println(fileInfo.callfunctionNames);
		//String splited[]= testFunctionBeingCalled.split("(");
		//System.out.println(splited[1]);
			//fileInfo.callfunctionNames.add(testFunctionBeingCalled);
		
//		if(callfunctionNames.size()>0)
//		System.out.println("It has functions");
		//System.out.println(callfunctionNames	

	  }
	}
	
