package JCup.ParserTokens;

public class TypeINT extends TypeId {
    Integer var;

    public TypeINT(Integer i) {
       var = i;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "IDENT";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
	    
		System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "ID");
	    
	}
}