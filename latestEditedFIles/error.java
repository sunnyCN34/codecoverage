package codecoverage;

import org.antlr.v4.runtime.*;
	
public  class error extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
        Object offendingSymbol,
        int line, int charPositionInLine,
        String msg,
        RecognitionException e)
        {
	    	//suppress errors.
    		System.out.print("");
        }
}
