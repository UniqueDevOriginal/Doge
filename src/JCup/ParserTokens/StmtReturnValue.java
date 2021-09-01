package JCup.ParserTokens;

public class StmtReturnValue extends Stmt {
    ReturnValue child;

    public StmtReturnValue(ReturnValue d) {
        child = d;
    }

    @Override
    void print(String prefix, boolean isTail) {
        String type = "Stmt";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        System.out.println(prefix + "    " + (isTail ? "|-- " : "|-- ") + "RETURN");
        child.print(prefix + (isTail ? "    " : "    "), false);
        System.out.println(prefix + "    " + (isTail ? "|-- " : "|-- ") + ";");

    }

}