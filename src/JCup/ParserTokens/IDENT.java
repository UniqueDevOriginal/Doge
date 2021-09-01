package JCup.ParserTokens;


public class IDENT extends Id{
    String var;

    public IDENT(String id) {
       var = id;
    }

	@Override
	void print(String prefix, boolean isTail)   {
		String type = "Id";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
	    
		System.out.println(prefix + "|    " + (isTail ?  "|-- " : "|-- ") + "IDENT");
	}
}
