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
		System.out.println(ctx.getText());
		String testFunctionBeingCalled = ctx.getText().split("(")[0];
		if(this.fileInfo.functions.indexOf(testFunctionBeingCalled) >= 0){
			System.out.println("foundFunctionBeingTested");
			//increment functions tested
			this.fileInfo.functionsTested++;
			
		}
		
		System.out.println("test");
		
		//functionNames.add(ctx.identifier().getText());
		
	}
	
	
	
}