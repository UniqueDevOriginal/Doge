package JCup.ParserTokens;

public class CHAR extends TypeId{
    Object caracter;

    public CHAR(Object c) {
       caracter = c;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "TypeId";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
		System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "CHAR");
	    
	}
}