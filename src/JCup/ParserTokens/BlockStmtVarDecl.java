package JCup.ParserTokens;

public class BlockStmtVarDecl extends BlockStmt {

    VarDecl child1;

    public BlockStmtVarDecl(VarDecl child) {
      child1 = child;
    }
  
  @Override
  void print(String prefix, boolean isTail) {

    String type = "BlockStmt";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    child1.print(prefix + (isTail ?"    " : "|   "), false);
    //System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ";");
      
  }
}   
