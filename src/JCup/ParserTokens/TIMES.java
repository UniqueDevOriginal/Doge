package JCup.ParserTokens;

public class TIMES extends ArithOp {
    Object expr;

    public TIMES(Object ex) {
        expr = ex; 
    }
    @Override
    void print(String prefix, boolean isTail) {
        System.out.println(prefix + "|    " + (isTail ? "|-- " : "|-- ") + "/");
    }
}