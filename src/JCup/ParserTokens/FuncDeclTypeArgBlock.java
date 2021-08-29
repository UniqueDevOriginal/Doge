package JCup.ParserTokens;

public class FuncDeclTypeArgBlock extends FunctionDecl {
    Id id;
    Argument arg;
    Block blo;

    public FuncDeclTypeArgBlock(Id child1,Argument child2,Block child3) {
        id = child1;
        arg = child2;
        blo = child3;
    }
  
  @Override
  void print(String prefix, boolean isTail) {

    String type = "FunctionDecl";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "VOID");
    id.print(prefix + (isTail ?"    " : "|   "), false);
    System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "(");
    arg.print(prefix + (isTail ?"    " : "|   "), false);
    System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ")");
    blo.print(prefix + (isTail ?"    " : "|   "), true);
  }
}    
