package codecoverage;

import java.io.*;
import java.util.*;


public class ExtractFunctionTool extends CFSCRIPTParserBaseListener {
	List<String> functionNames = new ArrayList<String>();
	static int count=0;
	@Override
	public void enterFunctionDeclaration(CFSCRIPTParser.FunctionDeclarationContext ctx) {
	//	String declared=ctx.identifier().getText();
		//System.out.println(declared);
	
		functionNames.add(ctx.identifier().getText());
	
	//	System.out.println(functionNames);
	/*	for (int i=0;i < functionNames.size();i++)
		{
			count ++;
		}
		
		System.out.println("total number of functions="+count);
	
	}
	public static int counter()
	{
		return count;
		
	}*/
	
	}

}