package JCup.ParserTokens;

public class Program extends Decl{
       Decl child;

       public Program (Decl d) {
           child = d;
           System.out.println(child);
       }

    @Override
    public
    void print(String prefix, boolean isTail) {

        System.out.println(child);

        String type = "Program";
	    System.out.println(prefix + (isTail ? type + "\n" + "| " : "| "));
        child.print(prefix + (isTail ?"    " : "|-- "), true);
        
    }
    
}
