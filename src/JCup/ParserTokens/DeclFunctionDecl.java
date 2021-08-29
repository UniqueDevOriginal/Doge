package JCup.ParserTokens;

public class DeclFunctionDecl extends Decl {
   FunctionDecl child1;

  public DeclFunctionDecl(FunctionDecl fd) {
    child1 = fd; 
  }

  @Override
  void print(String prefix, boolean isTail) {

    String type = "Decl";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    // child1.print(prefix + (isTail ? "    " : "|   "), false);
    child1.print(prefix + (isTail ?"    " : "|   "), true);
      
  }
}
