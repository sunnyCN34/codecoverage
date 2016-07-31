package codecoverage;

import java.io.*;
import java.util.*;


public class ExtractFunctionTool extends CFSCRIPTParserBaseListener {
	List<String> functionNames = new ArrayList<String>();
   int totalNumberOfFunction=0;


	@Override
	public void enterFunctionDeclaration(CFSCRIPTParser.FunctionDeclarationContext ctx) {
	
		totalNumberOfFunction ++;
	
		functionNames.add(ctx.identifier().getText());
	
	
	}

}