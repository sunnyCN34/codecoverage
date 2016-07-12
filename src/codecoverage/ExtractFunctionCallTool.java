package codecoverage;

import java.io.*;
import java.util.*;


public class ExtractFunctionCallTool extends CFSCRIPTParserBaseListener {
	List<String> functionNames = new ArrayList<String>();
	
	public void ExtractFunctionCallTool(List<String>_functionsNames){
		this.functionNames = _functionsNames;
	}
	
	@Override
	public void enterFunctionCall(CFSCRIPTParser.FunctionCallContext ctx) {
		
		//functionNames.add(ctx.identifier().getText());
		
	}
	
	
	
}