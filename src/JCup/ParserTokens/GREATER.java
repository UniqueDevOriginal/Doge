package JCup.ParserTokens;

public class GREATER extends RelOp {
    Object expr;

    public GREATER(Object ex) {
        expr = ex; 
    }
    @Override
    void print(String prefix, boolean isTail) {
        String type = "RelOp";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        System.out.println(prefix + "    " + (isTail ? "|-- " : "|-- ") + ">");
    }
}