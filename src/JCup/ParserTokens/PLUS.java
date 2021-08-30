package JCup.ParserTokens;

public class PLUS extends ArithOp {
    Object expr;

    public PLUS(Object ex) {
        expr = ex; 
    }
    @Override
    void print(String prefix, boolean isTail) {
        System.out.println(prefix + "|    " + (isTail ? "|-- " : "|-- ") + "+");
    }
}
