package JCup.ParserTokens;

public class FuncDeclTypeArgBlock extends FunctionDecl {
    TypeId ti;
    Id id;
    Argument arg;
    Block blo;

    public FuncDeclTypeArgBlock(TypeId ch4, Id child1,Argument child2,Block child3) {
      ti   =ch4;
      id = child1;
      arg = child2;
      blo = child3;
    }
  
  @Override
  void print(String prefix, boolean isTail) {

    String type = "FunctionDecl";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    ti.print(prefix + (isTail ?"|   " : "|   "), false);
    id.print(prefix + (isTail ?"|   " : "|   "), true);
    System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + "(");
    arg.print(prefix + (isTail ?"    " : "|   "), false);
    System.out.println(prefix + "|   " + (isTail ?  "| " : "| ") + "  ");
    System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ")");
    blo.print(prefix + (isTail ?"|   " : "|   "), true);
  }
}    
