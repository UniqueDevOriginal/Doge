package JCup.ParserTokens;

public class ExprNumberArithOp extends Expr{
    Integer n1;
    ArithOp op;
    Integer n2;

    public ExprNumberArithOp(Integer number1, ArithOp operat, Integer number2) {
        n1 = number1;
        op = operat;
        n2 = number2;
        resultadoExpr();
    }

    @Override
    void print(String prefix, boolean isTail) {
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + n1);
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "+");
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + n2);
    }

    void resultadoExpr(){
        if (op.getClass().getSimpleName().equals("PLUS")){
            int soma = n1+n2;
           System.out.println("O resultado da soma é: "+soma );
        }
    }
}
