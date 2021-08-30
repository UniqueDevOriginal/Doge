package JCup.ParserTokens;

public class ReturnValueExpr extends ReturnValue {
    Expr child1;

    public ReturnValueExpr(Expr ch1) {
        child1 = ch1;
    }
    @Override
    void print (String prefix, boolean isTail) {
        String type = "Expr";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        child1.print(prefix + (isTail ?"    " : "|   "), true);
    }
}