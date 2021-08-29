package JCup.ParserTokens;

public class FuncDeclTypeArgBlock extends FunctionDecl {
    Id id;
    Block blo;

    public FuncDeclTypeArgBlock(Id child1,  Block child3) {
        id = child1;
        blo = child3;
    }
  
  @Override
  void print(String prefix, boolean isTail) {

    String type = "FunctionDecl";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "VOID");
    id.print(prefix + (isTail ?"    " : "|   "), false);
    System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "(");
    System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + ")");
    blo.print(prefix + (isTail ?"    " : "|   "), true);
  }
}    
