package JCup.ParserTokens;

public class StmtWhile extends Stmt {
    ExprComp child1;
    Block child2;

    public StmtWhile(ExprComp ch1, Block ch2) {
        child1 = ch1;
        child2 = ch2;
    }

    @Override
    void print(String prefix, boolean isTail) {
        String type = "Stmt";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + "WHILE");
        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + "(");
        child1.print(prefix + (isTail ?"    " : "|   "), false);
        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + ")");
        child2.print(prefix + (isTail ?"    " : "|   "), true);
    }
}
