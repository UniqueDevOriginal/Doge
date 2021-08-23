package JCup.ParserTokens;

public class DeclVar extends Decl {
    VarDecl child1;

  public DeclVar(VarDecl child) {
    child1 = child;
  }

@Override
void print(String prefix, boolean isTail) {
    String type = "Decl";
	System.out.println(prefix + type +(isTail ?  "|-- " : "|-- ") );
	//child1.print(prefix + (isTail ? "    " : "|   "), false);
    child1.print(prefix + (isTail ?"    " : "|   "), true);
    
}
}
