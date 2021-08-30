package JCup.ParserTokens;

public class DeclVarDecl extends Decl {
    VarDecl child1;
    Decl child2;

  public DeclVarDecl(VarDecl child, Decl ch2) {
    child1 = child;
    child2 = ch2;
    System.out.println("VAI DAR MERDA VAI");
  }

  @Override
  void print(String prefix, boolean isTail) {

    String type = "Decl";

    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    // child1.print(prefix + (isTail ? "    " : "|   "), false);
    child1.print(prefix + (isTail ?"    " : "|   "), false);

    if (child2 == null)
    return;
    
    child2.print(prefix + (isTail ?"    " : "|   "), true);

  }
}
