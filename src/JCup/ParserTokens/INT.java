package JCup.ParserTokens;

public class INT extends TypeId {
    Integer var;

    public INT(Integer i) {
       var = i;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "TypeId";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
	    
		System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "INT");
	    
	}
}