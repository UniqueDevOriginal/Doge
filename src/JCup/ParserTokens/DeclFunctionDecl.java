package JCup.ParserTokens;

import java.io.IOException;

public class DeclFunctionDecl extends Decl {
   FunctionDecl child1;
   Decl child2;

  public DeclFunctionDecl(FunctionDecl fd, Decl ch2) {
    child1 = fd; 
    child2 = ch2;
  }

  @Override
  void print(String prefix, boolean isTail) throws IOException {

    String type = "Decl";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    // child1.print(prefix + (isTail ? "    " : "|   "), false);
    child1.print(prefix + (isTail ?"    " : "|   "), false);
    if (child2 == null)
    return;
    child2.print(prefix + (isTail ?"    " : "|   "), true);
  }
}
