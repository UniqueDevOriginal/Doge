package JCup.ParserTokens;

import java.io.IOException;

public class ProgramDecl extends Program {
    Decl child;

    public ProgramDecl(Decl d) {
        child = d;
    }

    @Override
    public 
    void print (String prefix, boolean isTail) throws IOException {
        if (child ==  null)
            return;
        String type = "Program";
        System.out.println(prefix + (isTail ? "" : "|-- ")+type);
        child.print(prefix + (isTail ?"    " : "|   "), true);
    }
    
}
