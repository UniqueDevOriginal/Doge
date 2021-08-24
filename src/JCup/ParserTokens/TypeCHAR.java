package JCup.ParserTokens;

public class TypeCHAR extends TypeId {
    char var;

    public TypeCHAR(char c) {
       var = c;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "IDENT";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
	    
		System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "ID");
	    
	}
}
