package JCup.ParserTokens;

public class NUMBER extends Literal {
    Integer num;

    public NUMBER(Integer i) {
       num = i; 
       System.out.println(num);
    }

    @Override
    public
    void print(String prefix, boolean isTail) {

        String type = "Literal";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ") + type);
        System.out.println(prefix + "|    " + (isTail ? "|-- " : "|-- ") + "NUMBER");

    }
}
