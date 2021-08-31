package JCup.ParserTokens;

public class StmtIfExprBlock extends Stmt {
    Expr child;
    Block child2;

    public StmtIfExprBlock(Expr e, Block b) {
        child = e;
        child2 = b;
    }

    @Override
    void print (String prefix, boolean isTail) {
        if (child ==  null)
            return;
        String type = "ReturnValue";
        System.out.println(prefix + (isTail ? "" : "|-- ")+type);
        System.out.println(prefix + "" + (isTail ?  "|-- " : "|-- ") + "RETURN");
        child.print(prefix + (isTail ?"    " : "|   "), true);
        System.out.println(prefix + "" + (isTail ?  "|-- " : "|-- ") + ";");
        
    }
    
}