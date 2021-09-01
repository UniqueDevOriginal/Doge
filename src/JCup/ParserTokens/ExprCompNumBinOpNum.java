package JCup.ParserTokens;

public class ExprCompNumBinOpNum extends ExprComp {
    Integer child1;
    BinOp child2;
    Integer child3;

    public ExprCompNumBinOpNum(Integer ch1, BinOp ch2, Integer ch3) {
        child1 = ch1;
        child2 = ch2;
        child3 = ch3;
    }

    @Override
    void print(String prefix, boolean isTail) {
        String type = "ExprComp";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + "NUMBER");
        child2.print(prefix + (isTail ?"    " : "|   "), false);
        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + "NUMBER");
    }
}
