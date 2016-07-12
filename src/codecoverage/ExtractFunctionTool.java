package codecoverage;

import java.io.*;
import java.util.*;


public class ExtractFunctionTool extends CFSCRIPTParserBaseListener {
	List<String> functionNames = new ArrayList<String>();
	@Override
	public void enterFunctionDeclaration(CFSCRIPTParser.FunctionDeclarationContext ctx) {
		int count=0;
		
		functionNames.add(ctx.identifier().getText());
		System.out.println(functionNames);
	/*	for (int i=0;i < functionNames.size();i++)
		{
			count ++;
		}
		
		System.out.println(""+count);
*/		
	}
	
	
	
}