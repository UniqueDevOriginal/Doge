package JCup.ParserTokens;

public class ExprNumberArithOp extends Expr{
    Literal lt1;
    ArithOp op;
    Literal lt2;

    public ExprNumberArithOp(Literal number1, ArithOp operat, Literal number2) {
        lt1 = number1;
        op = operat;
        lt2 = number2;
    }

    @Override
    void print(String prefix, boolean isTail) {
        lt1.print(prefix + (isTail ?"" : ""), false);
        //System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + lt1.getClass().getSimpleName());
        op.print(prefix + (isTail ?"" : ""), false);
        lt2.print(prefix + (isTail ?"" : ""), true);        //System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + lt2.getClass().getSimpleName());
    }
}
