package JCup.ParserTokens;

public class CHARACTER extends Literal {
    String charc;

    public CHARACTER(String ct) {
        charc = ct; 
    }

    @Override
    void print(String prefix, boolean isTail) {

        String type = "Literal";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        System.out.println(prefix + "|    " + (isTail ? "|-- " : "|-- ") + "CHARACTER");

    }
}