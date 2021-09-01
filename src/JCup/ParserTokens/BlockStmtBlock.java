package JCup.ParserTokens;


public class BlockStmtBlock extends Block {
    BlockStmt child;
    

    public BlockStmtBlock(BlockStmt d) {
        child = d;
    }

    @Override
    void print (String prefix, boolean isTail)  {
        String type = "Block";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
        if (child != null) {
            System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "{");
            child.print(prefix + (isTail ?"    " : "|   "), false);
            System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "}");
        }	else {
            System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "{");
            System.out.println(prefix + "    " + (isTail ?  "| " : "| ") + "  ");
            System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "}");
        }
    }
    
}

