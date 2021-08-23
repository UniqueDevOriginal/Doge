package JCup.ParserTokens;

public class IDENT extends Id {
    String var;

    public IDENT(String s) {
       var = s;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "F";
		System.out.println(prefix + (isTail ?  "\\-- " : "|-- ") + type);
	    
		System.out.println(prefix + "    " + (isTail ?  "\\-- " : "|-- ") + "ID");
	    
	}
}

