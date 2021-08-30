package JCup.ParserTokens;

public class MINUS extends ArithOp {
    Object expr;

    public MINUS(Object ex) {
        expr = ex; 
    }
    @Override
    void print(String prefix, boolean isTail) {
        System.out.println(prefix + "|    " + (isTail ? "|-- " : "|-- ") + "-");
    }
}
