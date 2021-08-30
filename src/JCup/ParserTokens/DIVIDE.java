package JCup.ParserTokens;

public class DIVIDE extends ArithOp {
    Object expr;

    public DIVIDE(Object ex) {
        expr = ex; 
    }
    @Override
    void print(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + "/");
    }
}
