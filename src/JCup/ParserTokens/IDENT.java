package JCup.ParserTokens;

import java.io.IOException;

public class IDENT extends Id{
    String var;

    public IDENT(String s) {
       var = s;
    }

	@Override
	void print(String prefix, boolean isTail) throws IOException {
		String type = "Id";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
	    
		System.out.println(prefix + "|    " + (isTail ?  "|-- " : "|-- ") + "IDENT");
	}
}
