package JCup.ParserTokens;
import java.io.IOException;

public class ReturnValueId extends ReturnValue {
    Id child;

    public ReturnValueId(Id d) {
        child = d;
    }

    @Override
    void print (String prefix, boolean isTail) throws IOException{
        child.print(prefix + (isTail ?"    " : "|   "), true);
    }
}
