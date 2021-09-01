package JCup.ParserTokens;


public class StmtReturnValue extends Stmt {
    ReturnValue child;

    public StmtReturnValue(ReturnValue d) {
        child = d;
    }

    @Override
    void print (String prefix, boolean isTail)   {
        if (child ==  null)
            return;
        String type = "ReturnValue";
        System.out.println(prefix + (isTail ? "" : "|-- ")+type);
        System.out.println(prefix + "" + (isTail ?  "|-- " : "|-- ") + "RETURN");
         child.print(prefix + (isTail ?"    " : "|   "), true);
        System.out.println(prefix + "" + (isTail ?  "|-- " : "|-- ") + ";");
        
    }
    
}