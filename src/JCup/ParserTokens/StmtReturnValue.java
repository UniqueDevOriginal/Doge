package JCup.ParserTokens;

public class StmtReturnValue extends Stmt {
    ReturnValue child1;
    Object child2;

    public StmtReturnValue(Object d1, ReturnValue d) {
        child1 = d;
        child2 = d1;
    }

    @Override
    void print(String prefix, boolean isTail) {
        String type = "Stmt";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        System.out.println(prefix + "    " + (isTail ? "|-- " : "|-- ") + "RETURN");
        child1.print(prefix + (isTail ? "    " : "    "), false);
        System.out.println(prefix + "    " + (isTail ? "|-- " : "|-- ") + ";");

    }

}