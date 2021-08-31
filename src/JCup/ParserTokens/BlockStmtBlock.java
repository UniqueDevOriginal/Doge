package JCup.ParserTokens;

import java.io.IOException;

public class BlockStmtBlock extends Block {
    BlockStmt child;
    

    public BlockStmtBlock(BlockStmt d) {
        child = d;
    }

    @Override
    void print (String prefix, boolean isTail) throws IOException {
        String type = "Block";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
        System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "{");
        child.print(prefix + (isTail ?"    " : "|   "), false);
        System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "}");
    }
    
}

