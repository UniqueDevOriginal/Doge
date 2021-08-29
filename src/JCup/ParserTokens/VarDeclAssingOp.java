package JCup.ParserTokens;

public class VarDeclAssingOp extends VarDecl {
    Var child1;
    AssingOp child2;
    Literal child3;


    public VarDeclAssingOp(Var cd1,AssingOp cd2 ,Literal cd3) {
        child1 = cd1;
        child2 = cd2;
        child3 = cd3;
    }

    @Override
    public void print(String prefix, boolean isTail) {

        String type = "VarDecl";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        child1.print(prefix + (isTail ? "    " : "|   "), false);
        child2.print(prefix + (isTail ? "    " : "|   "), false);
        child3.print(prefix + (isTail ? "    " : "|   "), true);
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ";");
    }

}
