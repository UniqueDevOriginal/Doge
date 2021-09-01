package JCup.ParserTokens;

public class ExprNumberArithOp extends Expr {
    Integer lt1;
    ArithOp op;
    Integer lt2;

    public ExprNumberArithOp(Integer number1, ArithOp operat, Integer number2) {
        op = operat;
    }

    @Override
    void print(String prefix, boolean isTail) {

        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + "NUMBER");
        op.print(prefix + (isTail ? "" : ""), false);
        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + "NUMBER");
    }
}
