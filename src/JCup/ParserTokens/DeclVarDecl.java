package JCup.ParserTokens;

public class DeclVarDecl extends Decl {
    VarDecl child1;

  public DeclVarDecl(VarDecl child) {
    child1 = child;
  }

  @Override
  void print(String prefix, boolean isTail) {

    String type = "Decl";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    // child1.print(prefix + (isTail ? "    " : "|   "), false);
    child1.print(prefix + (isTail ?"    " : "|   "), true);
      
  }
}
