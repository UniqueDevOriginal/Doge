package JCup.ParserTokens;


public class ReturnValueId extends ReturnValue {
    Id child;

    public ReturnValueId(Id d) {
        child = d;
    }

    @Override
    void print (String prefix, boolean isTail)  {
        child.print(prefix + (isTail ?"    " : "|   "), true);
    }
}
