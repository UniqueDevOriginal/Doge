package JCup.ParserTokens;

public class VarListVar extends VarList {
    Var child1;

    public VarListVar(Var ch1) {
      child1 = ch1;
    }
  
  @Override
  void print(String prefix, boolean isTail) {

    String type = "VarDecl";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    child1.print(prefix + (isTail ?"    " : "|   "), false);
    //System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ";");
  }
} 
