package JCup.ParserTokens;

import java.io.IOException;

public class IDENT extends Id{
    String var;

    public IDENT(String s) {
       var = s;
    }

	@Override
	void print(String prefix, boolean isTail) throws IOException {
		
		if ( var.equals("a"))
		{
			throw new java.io.IOException("\033[0;31m"+"Illegal character "+"\033[0m"); 
		}
	    String type = "Id";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
	    
		System.out.println(prefix + "|    " + (isTail ?  "|-- " : "|-- ") + "IDENT");
	}
}
