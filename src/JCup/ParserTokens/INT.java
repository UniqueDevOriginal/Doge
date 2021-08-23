package JCup.ParserTokens;


public class INT extends TypeId{
    Integer number;

    public INT(Integer num) {
       number = num;
    }

	@Override
	void print(String prefix, boolean isTail) {
		
	    String type = "F";
		System.out.println(prefix + (isTail ?  "\\-- " : "|-- ") + type);
		System.out.println(prefix + "    " + (isTail ?  "\\-- " : "|-- ") + "INT");
	    
	}
}