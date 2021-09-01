package JCup.ParserTokens;

public class NOTEQUALS extends EqOp {
    Object var;

    public NOTEQUALS(Object eq) {
       var = eq;
    }

	@Override
	void print(String prefix, boolean isTail) {
		String type = "EqOp";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
		System.out.println(prefix + "|    " + (isTail ?  "|-- " : "|-- ") + "!=");    
	}
}
