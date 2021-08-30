package JCup.ParserTokens;

public class ArgumentVarList extends Argument {
    VarList child;

    public ArgumentVarList(VarList d) {
        child = d;
    }

    @Override
    void print (String prefix, boolean isTail) {
        child.print(prefix + (isTail ?"    " : "|   "), true);
    }
    
}
