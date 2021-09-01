package JCup.ParserTokens;

public class ActualsLiteral extends Actuals {
    Literal child1;

    public ActualsLiteral(Literal ch1) {
        child1 = ch1;
    }

    @Override
    void print(String prefix, boolean isTail) {
        String type = "Actuals";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        child1.print(prefix + (isTail ?"|   " : "|   "), false);
    }
}