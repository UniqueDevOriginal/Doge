package JCup.ParserTokens;

public class StmtTothemoon extends Stmt {
    Id child1;
    Object child2;

    public StmtTothemoon( Object ch2, Id ch1) {
        child1 = ch1;
        child2 = ch2;
    }
    @Override
    void print(String prefix, boolean isTail) {
        String type = "Stmt";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + "TOTHEMOON");
        child1.print(prefix + (isTail ? "   " : "|   "), false);
        System.out.println(prefix + "|   " + (isTail ? "|-- " : "|-- ") + ";");

    }
}