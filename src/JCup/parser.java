
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package JCup;

import java_cup.runtime.*;
import JCup.ParserTokens.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\067\000\002\002\003\000\002\002\004\000\002\003" +
    "\004\000\002\003\004\000\002\003\002\000\002\006\004" +
    "\000\002\006\006\000\002\007\004\000\002\010\005\000" +
    "\002\010\003\000\002\004\003\000\002\004\003\000\002" +
    "\005\003\000\002\013\010\000\002\013\010\000\002\011" +
    "\003\000\002\011\002\000\002\012\005\000\002\016\004" +
    "\000\002\016\004\000\002\016\002\000\002\014\007\000" +
    "\002\014\007\000\002\014\006\000\002\014\007\000\002" +
    "\014\003\000\002\014\005\000\002\017\003\000\002\017" +
    "\003\000\002\017\003\000\002\017\002\000\002\026\007" +
    "\000\002\027\003\000\002\027\005\000\002\027\005\000" +
    "\002\027\003\000\002\027\002\000\002\015\005\000\002" +
    "\015\005\000\002\015\005\000\002\015\005\000\002\015" +
    "\005\000\002\024\003\000\002\024\003\000\002\025\003" +
    "\000\002\025\003\000\002\025\003\000\002\025\003\000" +
    "\002\023\003\000\002\020\003\000\002\020\003\000\002" +
    "\021\003\000\002\021\003\000\002\022\003\000\002\022" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\145\000\012\002\ufffd\004\014\005\005\006\010\001" +
    "\002\000\004\002\001\001\002\000\004\032\ufff7\001\002" +
    "\000\004\002\147\001\002\000\004\032\027\001\002\000" +
    "\004\032\027\001\002\000\012\002\ufffd\004\014\005\005" +
    "\006\010\001\002\000\012\002\ufffd\004\014\005\005\006" +
    "\010\001\002\000\006\024\015\031\016\001\002\000\004" +
    "\032\ufff6\001\002\000\006\033\uffd1\034\uffd1\001\002\000" +
    "\026\002\ufffc\004\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc" +
    "\011\ufffc\012\ufffc\030\ufffc\032\ufffc\001\002\000\006\033" +
    "\021\034\022\001\002\000\004\031\023\001\002\000\004" +
    "\031\uffd7\001\002\000\010\017\uffd6\026\uffd6\031\uffd6\001" +
    "\002\000\026\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb" +
    "\010\ufffb\011\ufffb\012\ufffb\030\ufffb\032\ufffb\001\002\000" +
    "\004\002\ufffe\001\002\000\004\002\uffff\001\002\000\004" +
    "\025\030\001\002\000\024\017\ufff5\020\ufff5\021\ufff5\022" +
    "\ufff5\023\ufff5\024\ufff5\025\ufff5\026\ufff5\031\ufff5\001\002" +
    "\000\010\004\014\005\005\026\ufff1\001\002\000\004\032" +
    "\027\001\002\000\004\026\037\001\002\000\004\026\ufff2" +
    "\001\002\000\006\017\035\026\ufff8\001\002\000\006\004" +
    "\014\005\005\001\002\000\004\026\ufff9\001\002\000\004" +
    "\027\040\001\002\000\022\004\014\005\005\007\051\010" +
    "\047\011\042\012\052\030\uffed\032\027\001\002\000\012" +
    "\002\ufff3\004\ufff3\005\ufff3\006\ufff3\001\002\000\004\025" +
    "\135\001\002\000\004\030\134\001\002\000\006\024\015" +
    "\025\117\001\002\000\022\004\uffe8\005\uffe8\007\uffe8\010" +
    "\uffe8\011\uffe8\012\uffe8\030\uffe8\032\uffe8\001\002\000\022" +
    "\004\014\005\005\007\051\010\047\011\042\012\052\030" +
    "\uffed\032\027\001\002\000\004\025\110\001\002\000\022" +
    "\004\014\005\005\007\051\010\047\011\042\012\052\030" +
    "\uffed\032\027\001\002\000\004\025\103\001\002\000\012" +
    "\031\uffe3\032\027\033\056\034\022\001\002\000\004\031" +
    "\uffe4\001\002\000\014\020\072\021\066\022\074\023\064" +
    "\031\uffe5\001\002\000\004\031\uffe6\001\002\000\030\013" +
    "\070\014\061\015\073\016\063\017\uffd7\020\072\021\066" +
    "\022\074\023\064\026\uffd7\031\uffd7\001\002\000\004\031" +
    "\060\001\002\000\022\004\uffe7\005\uffe7\007\uffe7\010\uffe7" +
    "\011\uffe7\012\uffe7\030\uffe7\032\uffe7\001\002\000\004\033" +
    "\uffd4\001\002\000\004\033\077\001\002\000\004\033\uffd2" +
    "\001\002\000\006\032\uffcb\033\uffcb\001\002\000\006\032" +
    "\uffcf\033\uffcf\001\002\000\006\032\uffcd\033\uffcd\001\002" +
    "\000\006\032\027\033\076\001\002\000\004\033\uffd5\001" +
    "\002\000\006\032\uffd0\033\uffd0\001\002\000\006\032\uffce" +
    "\033\uffce\001\002\000\004\033\uffd3\001\002\000\006\032" +
    "\uffcc\033\uffcc\001\002\000\010\017\uffda\026\uffda\031\uffda" +
    "\001\002\000\010\017\uffdc\026\uffdc\031\uffdc\001\002\000" +
    "\010\017\uffd8\026\uffd8\031\uffd8\001\002\000\006\032\027" +
    "\033\102\001\002\000\010\017\uffdb\026\uffdb\031\uffdb\001" +
    "\002\000\010\017\uffd9\026\uffd9\031\uffd9\001\002\000\004" +
    "\032\027\001\002\000\004\026\105\001\002\000\004\031" +
    "\106\001\002\000\022\004\uffe9\005\uffe9\007\uffe9\010\uffe9" +
    "\011\uffe9\012\uffe9\030\uffe9\032\uffe9\001\002\000\004\030" +
    "\uffee\001\002\000\006\032\027\033\113\001\002\000\012" +
    "\020\072\021\066\022\074\023\064\001\002\000\004\026" +
    "\114\001\002\000\022\013\070\014\061\015\073\016\063" +
    "\020\072\021\066\022\074\023\064\001\002\000\004\027" +
    "\040\001\002\000\022\004\uffec\005\uffec\007\uffec\010\uffec" +
    "\011\uffec\012\uffec\030\uffec\032\uffec\001\002\000\004\030" +
    "\uffef\001\002\000\012\026\uffdd\032\027\033\056\034\022" +
    "\001\002\000\006\033\021\034\022\001\002\000\004\031" +
    "\122\001\002\000\022\004\uffea\005\uffea\007\uffea\010\uffea" +
    "\011\uffea\012\uffea\030\uffea\032\uffea\001\002\000\006\017" +
    "\132\026\uffe1\001\002\000\004\026\130\001\002\000\006" +
    "\017\126\026\uffde\001\002\000\012\026\uffdd\032\027\033" +
    "\056\034\022\001\002\000\004\026\uffdf\001\002\000\004" +
    "\031\131\001\002\000\022\004\uffe2\005\uffe2\007\uffe2\010" +
    "\uffe2\011\uffe2\012\uffe2\030\uffe2\032\uffe2\001\002\000\012" +
    "\026\uffdd\032\027\033\056\034\022\001\002\000\004\026" +
    "\uffe0\001\002\000\026\002\ufff0\004\ufff0\005\ufff0\006\ufff0" +
    "\007\ufff0\010\ufff0\011\ufff0\012\ufff0\030\ufff0\032\ufff0\001" +
    "\002\000\006\032\027\033\113\001\002\000\004\026\137" +
    "\001\002\000\004\027\040\001\002\000\022\004\uffeb\005" +
    "\uffeb\007\uffeb\010\uffeb\011\uffeb\012\uffeb\030\uffeb\032\uffeb" +
    "\001\002\000\012\017\ufffa\024\ufffa\026\ufffa\031\ufffa\001" +
    "\002\000\010\024\ufffa\025\143\031\ufffa\001\002\000\010" +
    "\004\014\005\005\026\ufff1\001\002\000\004\026\145\001" +
    "\002\000\004\027\040\001\002\000\012\002\ufff4\004\ufff4" +
    "\005\ufff4\006\ufff4\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\145\000\016\002\005\003\003\004\006\006\010\007" +
    "\012\013\011\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\141\001\001\000\004\005" +
    "\025\001\001\000\014\003\024\004\006\006\010\007\012" +
    "\013\011\001\001\000\014\003\023\004\006\006\010\007" +
    "\012\013\011\001\001\000\004\023\016\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\024" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\004\030" +
    "\007\033\010\032\011\031\001\001\000\004\005\140\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\030\007\033\010\035\001\001\000\002\001" +
    "\001\000\004\012\040\001\001\000\020\004\030\005\043" +
    "\006\045\007\012\014\047\016\042\026\044\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\023\117\001\001\000\002\001\001\000\020\004\030\005" +
    "\043\006\045\007\012\014\047\016\115\026\044\001\001" +
    "\000\002\001\001\000\020\004\030\005\043\006\045\007" +
    "\012\014\047\016\106\026\044\001\001\000\002\001\001" +
    "\000\012\005\053\015\054\017\056\024\052\001\001\000" +
    "\002\001\001\000\010\020\077\021\070\022\064\001\001" +
    "\000\002\001\001\000\012\020\066\021\070\022\064\025" +
    "\061\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\074" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\005\100\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\103" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\110\015\111\001\001" +
    "\000\010\020\077\021\070\022\064\001\001\000\002\001" +
    "\001\000\012\020\066\021\070\022\064\025\061\001\001" +
    "\000\004\012\114\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\005\110\015\124\024\122\027\123\001\001" +
    "\000\004\024\120\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\005\110\015\124\024\122\027\126\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\005\110\015\124\024\122\027\132\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\110\015\135\001\001" +
    "\000\002\001\001\000\004\012\137\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\004\030" +
    "\007\033\010\032\011\143\001\001\000\002\001\001\000" +
    "\004\012\145\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /* Sobrescrever o método report_error para que ele exiba a linha e
        coluna de onde ocorreu o erro na entrada, bem como no
        razão para o erro que é passado para o método no
        String 'mensagem'.  */
    public void report_error(String message, Object info) {

        /* Crie um StringBuilder chamado 'm' com a string 'Erro' nele. */
        StringBuilder m = new StringBuilder("Error");

        /* Verifique se as informações passadas para o método são 
        do tipo java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {
            /* Declara um objeto java_cup.runtime.Symbol 's' com as
                informações  que está sendo convertida. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);

            /* Verifica se a linha da entrada >= 0 */
            if (s.left >= 0) {
                /* Adiciona msg de erro na linha do erro da entrada. */
                m.append(" in line "+(s.left+1));
                /*  Verifica se a coluna da entrada >= 0 */
                if (s.right >= 0)
                    /* Adiciona msg de erro na coluna do erro da entrada. */
                    m.append(", column "+(s.right+1));
            }
        }

        /* Por fim adiciona a mensagem de erro na tela. */
        m.append(" : "+message);

        /* Imprime o conteudo de 'm' que contem a msg de erro, 
        com as informação de linha e coluna e a msg*/
        System.err.println(m);
    }

    /* Sobrescrever report_fatal_error para exibit linha e coluna do erro 
       alem da mensagem do erro, e termina a execução. */
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= Decl 
            {
              Program RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Decl d = (Decl)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Program(d); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Program start_val = (Program)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Decl ::= VarDecl Decl 
            {
              Decl RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Decl",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Decl ::= FunctionDecl Decl 
            {
              Decl RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Decl",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Decl ::= 
            {
              Decl RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Decl",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VarDecl ::= Var SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDecl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // VarDecl ::= Var AssingOp Literal SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDecl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Var ::= TypeId Id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Var",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // VarList ::= Var COMMA VarList 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarList",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // VarList ::= Var 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarList",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TypeId ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TypeId",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TypeId ::= CHAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TypeId",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Id ::= IDENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Id",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // FunctionDecl ::= TypeId Id LEFTPAREN Argument RIGHTPAREN Block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FunctionDecl",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // FunctionDecl ::= VOID Id LEFTPAREN Argument RIGHTPAREN Block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FunctionDecl",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Argument ::= VarList 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Argument",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Argument ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Argument",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Block ::= LEFTBRACE BlockStmt RIGHTBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Block",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // BlockStmt ::= VarDecl BlockStmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BlockStmt",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // BlockStmt ::= Stmt BlockStmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BlockStmt",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // BlockStmt ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BlockStmt",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Stmt ::= IF LEFTPAREN Expr RIGHTPAREN Block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Stmt ::= WHILE LEFTPAREN Expr RIGHTPAREN Block 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Stmt ::= Id AssingOp Literal SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Stmt ::= SHOW LEFTPAREN Id RIGHTPAREN SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Stmt ::= Call 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Stmt ::= RETURN ReturnValue SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ReturnValue ::= Expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ReturnValue",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ReturnValue ::= Id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ReturnValue",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ReturnValue ::= Literal 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ReturnValue",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // ReturnValue ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ReturnValue",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // Call ::= Id LEFTPAREN Actuals RIGHTPAREN SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Call",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Actuals ::= Literal 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Actuals",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Actuals ::= Literal COMMA Actuals 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Actuals",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Actuals ::= Expr COMMA Actuals 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Actuals",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Actuals ::= Expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Actuals",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Actuals ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Actuals",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Expr ::= NUMBER BinOp NUMBER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Expr ::= Id BinOp Id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Expr ::= NUMBER BinOp Id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // Expr ::= Id BinOp NUMBER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // Expr ::= NUMBER ArithOp NUMBER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // Literal ::= NUMBER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Literal",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // Literal ::= CHARACTER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Literal",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // ArithOp ::= PLUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArithOp",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // ArithOp ::= MINUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArithOp",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // ArithOp ::= TIMES 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArithOp",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // ArithOp ::= DIVIDE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArithOp",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // AssingOp ::= EQUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("AssingOp",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // BinOp ::= RelOp 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BinOp",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // BinOp ::= EqOp 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BinOp",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // RelOp ::= LESS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelOp",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // RelOp ::= GREATER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelOp",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // EqOp ::= EQUALS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EqOp",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // EqOp ::= NOTEQUALS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EqOp",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
