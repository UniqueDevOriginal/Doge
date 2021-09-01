package JCup.ParserTokens;

public class StmtCall extends Stmt {
    Call child1;

    public StmtCall(Call ch1) {
        child1 = ch1;
    }

    @Override
    void print(String prefix, boolean isTail) {
        String type = "Stmt";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        child1.print(prefix + (isTail ?"    " : "|   "), false);
    }
}
