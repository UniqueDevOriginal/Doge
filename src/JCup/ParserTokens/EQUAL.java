package JCup.ParserTokens;

public class EQUAL extends AssingOp {
    Object var;

    public EQUAL(Object eq) {
       var = eq;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "AssingOp";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
		System.out.println(prefix + "|    " + (isTail ?  "|-- " : "|-- ") + "=");
	    
	}
}
