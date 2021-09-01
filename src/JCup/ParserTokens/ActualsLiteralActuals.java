package JCup.ParserTokens;

public class ActualsLiteralActuals extends Actuals {
    Literal child1;
    Actuals child2;

    public ActualsLiteralActuals(Literal ch1, Actuals ch2) {
      child1 = ch1;
      child2 = ch2;
    }
  
  @Override
  void print(String prefix, boolean isTail)   {
    String type = "Actuals";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    child1.print(prefix + (isTail ?"    " : "|   "), false);
    System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + ",");
    child2.print(prefix + (isTail ?"    " : "|   "), true);

    //System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ";");
   }
} 
