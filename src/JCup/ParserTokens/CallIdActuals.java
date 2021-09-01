package JCup.ParserTokens;

public class CallIdActuals extends Call {
    Id child1;
    Actuals child2;

    public CallIdActuals(Id ch1, Actuals ch2) {
        child1 = ch1;
        child2 = ch2;
    }

    @Override
    void print(String prefix, boolean isTail)  {
        String type = "Call";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        child1.print(prefix + (isTail ? "|   " : "|   "), false);
        child2.print(prefix + (isTail ? "|   " : "|   "), false);
        System.out.println(prefix + "|   " + (isTail ?  "|-- " : "|-- ") + ";");
    }
}
