package JCup.ParserTokens;

import java.io.IOException;

public class VarListVar extends VarList {
    Var child1;

    public VarListVar(Var ch1) {
      child1 = ch1;
    }
  
  @Override
  void print(String prefix, boolean isTail) throws IOException {
    child1.print(prefix + (isTail ?"" : "|   "), true);
    //System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ";");
  }
} 
