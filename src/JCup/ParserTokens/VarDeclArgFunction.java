package JCup.ParserTokens;

public class VarDeclArgFunction extends VarDecl {
    Var child1;

    public VarDeclArgFunction(Var ch1) {
      child1 = ch1;
      System.out.println(); 
      System.out.println(child1); 
    }
  
  @Override
  void print(String prefix, boolean isTail) {

    String type = "Var";
		System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
    child1.print(prefix + (isTail ?"   " : "|   "), true);
  }
}    
