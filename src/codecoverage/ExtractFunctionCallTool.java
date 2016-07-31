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
		fileInfo.callfunctionNames.add(value);
	  }
	}
	
