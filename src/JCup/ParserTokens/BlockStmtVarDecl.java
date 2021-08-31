package JCup.ParserTokens;

import java.io.IOException;

public class BlockStmtVarDecl extends BlockStmt {

    VarDecl child1;
    BlockStmt child2;

    public BlockStmtVarDecl(VarDecl ch1, BlockStmt ch2) {
      child1 = ch1;
      child2 = ch2;
    }
  
  @Override
  void print(String prefix, boolean isTail) throws IOException {

    String type = "BlockStmt";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    child1.print(prefix + (isTail ?"    " : "|   "), false);
    //System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ";");
    if (child2 == null)
      return;
    child2.print(prefix + (isTail ?"    " : "|   "), true);
       }
}   
