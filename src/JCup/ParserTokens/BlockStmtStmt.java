package JCup.ParserTokens;


public class BlockStmtStmt extends BlockStmt {
    Stmt child1;
    BlockStmt child2;

  public BlockStmtStmt(Stmt ch1, BlockStmt ch2) {
    child1 = ch1;
    child2 = ch2;
 
  }

  @Override
  void print(String prefix, boolean isTail){
    String type = "StmtBlock";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    // child1.print(prefix + (isTail ? "    " : "|   "), false);
    child1.print(prefix + (isTail ?"    " : "|   "), false);
    if (child2 == null) {
      return;
    }
    child2.print(prefix + (isTail ?"    " : "|   "), true);

  }
}