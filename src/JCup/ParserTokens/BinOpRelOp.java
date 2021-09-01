package JCup.ParserTokens;

public class BinOpRelOp extends BinOp {
    RelOp child1;

  public BinOpRelOp(RelOp ch1) {
    child1 = ch1;
  }

  @Override
  void print(String prefix, boolean isTail)   {
    String type = "BinOp";
    System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
    // child1.print(prefix + (isTail ? "    " : "|   "), false);
    child1.print(prefix + (isTail ?"    " : "|   "), true);
  }
}