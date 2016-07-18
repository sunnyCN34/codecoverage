package codecoverage;

import java.io.*;
import java.util.*;


public class ExtractFunctionTool extends CFSCRIPTParserBaseListener {
	List<String> functionNames = new ArrayList<String>();
	@Override
	public void enterFunctionDeclaration(CFSCRIPTParser.FunctionDeclarationContext ctx) {
		
		functionNames.add(ctx.identifier().getText());
		
	}
	
	
	
}