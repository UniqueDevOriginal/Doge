package JCup.ParserTokens;

public class ID extends Id {
    char var;

    public ID(char s) {
       var = s;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "IDENT";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
	    
		System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "ID");
	    
	}
}

