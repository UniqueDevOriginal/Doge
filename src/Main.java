import java.io.*;

import JCup.parser;
import JCup.ParserTokens.E;
import JFlex.*;
   
public class Main {
  static public void main(String argv[]) {    
    /* Start the parser */
    try {
    	String testFile = "src\\program.doge";
      Lexer lexedInput = new Lexer(new FileReader(testFile));
      parser p = new parser(lexedInput);
      E result = (E) p.parse().value;
      System.out.println();
      System.out.println();
      result.print("",true);
      
@SuppressWarnings("unused")
int i = 0;   
    } catch (Exception e) {
      /* do cleanup here -- possibly rethrow e */
      e.printStackTrace();
    }
  }
}