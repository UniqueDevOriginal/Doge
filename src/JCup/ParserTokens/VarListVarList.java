package JCup.ParserTokens;

public class VarListVarList extends VarList {
    Var child1;
    VarList child2;

    public VarListVarList(Var ch1, VarList ch2) {
      child1 = ch1;
      child2 = ch2;
    }
  
  @Override
  void print(String prefix, boolean isTail) {
    child1.print(prefix + (isTail ?"|   " : "|   "), false);
    System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ",");
    child2.print(prefix +"|   "+ (isTail ?"|   " : "|  "), true);
    
  }
} 
