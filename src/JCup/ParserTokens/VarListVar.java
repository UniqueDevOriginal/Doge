package JCup.ParserTokens;

public class VarListVar extends VarList {

    VarDecl child1;

    public VarListVar(VarDecl child) {
      child1 = child;
    }
  
  @Override
  void print(String prefix, boolean isTail) {

    String type = "Var";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    child1.print(prefix + (isTail ?"    " : "|   "), false);
    System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + ";");
      
  }
}  