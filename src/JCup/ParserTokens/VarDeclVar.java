package JCup.ParserTokens;

public class VarDeclVar extends VarDecl {

    Var child1;

    public VarDeclVar(Var child) {
      child1 = child;
    }
  
  @Override
  void print(String prefix, boolean isTail) {
      String type = "VarDecl";
      System.out.println(prefix + (isTail ?  "|-- " : "|-- ")+type );
      //child1.print(prefix + (isTail ? "    " : "|   "), false);
      child1.print(prefix + (isTail ?"    " : "|   "), true);
      
  }
}    

