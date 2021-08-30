package JCup.ParserTokens;

public class ArgumentVarList extends Argument {
    VarList child;

    public ArgumentVarList(VarList d) {
        child = d;
    }

    @Override
    void print (String prefix, boolean isTail) {
        String type = "Argument";
        System.out.println(prefix + (isTail ? "|-- " : "|-- ")+type);
        if (child != null) {
            child.print(prefix + (isTail ?"    " : "|   "), true);
        } else {
            System.out.println(prefix + "|   " + (isTail ?  "| " : "| ") + " ");
        }
    }
    
}
