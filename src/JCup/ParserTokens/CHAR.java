package JCup.ParserTokens;

public class CHAR extends TypeId{
    char caracter;

    public CHAR(char c) {
       caracter = c;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "F";
		System.out.println(prefix + (isTail ?  "\\-- " : "|-- ") + type);
		System.out.println(prefix + "    " + (isTail ?  "\\-- " : "|-- ") + "INT");
	    
	}
}