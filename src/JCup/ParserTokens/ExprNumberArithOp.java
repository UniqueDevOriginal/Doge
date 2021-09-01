package JCup.ParserTokens;

public class ExprNumberArithOp extends Expr{
    Integer lt1;
    ArithOp op;
    Integer lt2;

    public ExprNumberArithOp(Integer number1, ArithOp operat, Integer number2) {
        lt1 = number1;
        op = operat;
        lt2 = number2;
    }

    @Override
    void print(String prefix, boolean isTail) {
       
       System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "NUMBER");
        op.print(prefix + (isTail ?"" : ""), false);
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "NUMBER");
    }
}
