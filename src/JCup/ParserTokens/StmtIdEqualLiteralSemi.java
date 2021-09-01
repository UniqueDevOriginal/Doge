package JCup.ParserTokens;

public class StmtIdEqualLiteralSemi extends Stmt {
    Id child1;
    Literal child2;

    public StmtIdEqualLiteralSemi(Id ch1, Literal ch2) {
        child1 = ch1;
        child2 = ch2;
    }

    @Override
    void print(String prefix, boolean isTail)  {
        String type = "Stmt";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        child1.print(prefix + (isTail ? "|   " : "|   "), false);
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "=");
        child2.print(prefix + (isTail ? "|   " : "|   "), true);
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ";");
    }
}
