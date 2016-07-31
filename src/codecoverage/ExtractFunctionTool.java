package codecoverage;

import java.io.*;
import java.util.*;


public class ExtractFunctionTool extends CFSCRIPTParserBaseListener {
	List<String> functionNames = new ArrayList<String>();
   int totalNumberOfFunction=0;
//private static ExtractFunctionTool singletonObject;
//private ExtractFunctionTool(){}
//public static synchronized ExtractFunctionTool getSingletonObject(){
//	if(singletonObject==null){
//		singletonObject= new ExtractFunctionTool();
//	}
//	return singletonObject;
//}

	@Override
	public void enterFunctionDeclaration(CFSCRIPTParser.FunctionDeclarationContext ctx) {
	
		totalNumberOfFunction ++;
	
		functionNames.add(ctx.identifier().getText());
	//	System.out.println("this is the value number of functions="+totalNumberOfFunction);
		
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