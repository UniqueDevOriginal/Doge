package JCup.ParserTokens;

public class ExprNumberArithOp extends Expr{
    Integer n1;
    ArithOp op;
    Integer n2;

    public ExprNumberArithOp(Integer number1, ArithOp operat, Integer number2) {
        n1 = number1;
        op = operat;
        n2 = number2;
    }

    @Override
    void print(String prefix, boolean isTail) {
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + n1.getClass());
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "+");
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "NUMBER");
    }
}
