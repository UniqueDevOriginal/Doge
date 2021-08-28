/* --------------------------Usercode Section------------------------ */
package JFlex;
import java_cup.runtime.*;
import JCup.*;

%%

/* -----------------Opções e declarações do JFlex----------------- */

/*
   O nome da classe que JFlex criará será Lexer.
   Escreve o código no arquivo Lexer.java.
*/
%public
%class Lexer

/*
  O número da linha atual pode ser acessado com a variável yyline
  e o número da coluna atual com a variável yycolumn.
*/
%line
%column

/*
   Compatibilidade para o JCUP para fazer interface com o analisador gerado.
*/
%cup

/*
  Código entre %{ e %}, são usados para incluir código Java dentro da classe do scanner.
*/
%{
    /* Criar um novo simbolo com informações sobre token, sem valor */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Criar um novo simbolo com informações sobre token, com valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

%eofclose


// /*
//    Macros que serão usadas no código gerado pelo JFlex.
//    expressões regulares que serão usadas posteriormente
// */

// /* Nova linha representada por \r, \n ou \r\n */
// NewLine = \r|\n|\r\n

// /* tanto uma nova linha como um tab \t u um \f são
//    considerados espaçoes em branco */
// WhiteSpace = {NewLine} | [ \t\f]

// /* alfabeto de a-z */ 
// Alpha  = [|a-z|]

// /* caracter ficam entre aspas simples */
// Character = [\'][{Alpha}][\']

// /* digitos entre 0 - 9 */
// Digit = [0-9]

// /* numeros 0 ou as combinacoes de 1-9 com 0-9 */
// Number =  0 | [1-9][0-9]*

// /* união do alfabeto com os digitos */
// AlphaNum = [{Alpha}|{Digit}]

// /* ids são combinaçoes de letras podendo ou não ser seguido de numeros
//    mas nunca ter numero como prefixos */
// Id = {Alpha}{AlphaNum}*

// /* tudo após um simbolo $ até o \n é considerado Comentario */
// Comentario = "$"[^\n]*
// // String = [\"][^\n\"]+[\"]

//  %%
//  /* ------------------------Lexical Rules Section---------------------- */


//     ";"      { System.out.print("; "); return symbol(sym.SEMI);}
//     "char"   { System.out.print("char "); return symbol(sym.CHAR);}
//     "int"    { System.out.print("int "); return symbol(sym.INT);}
//     "void"   { System.out.print("void "); return symbol(sym.VOID);}
//     "("      { System.out.print("( "); return symbol(sym.LEFTPAREN);}
//     ")"      { System.out.print(") "); return symbol(sym.RIGHTPAREN);}
//     "{"      { System.out.print("{ "); return symbol(sym.LEFTBRACE);}
//     "}"      { System.out.print("} "); return symbol(sym.RIGHTBRACE);}
//     ","      { System.out.print(", "); return symbol(sym.COMMA);}
//     "<"      { System.out.print("< "); return symbol(sym.LESS);}
//     ">"      { System.out.print("> "); return symbol(sym.GREATER);}
//     "="      { System.out.print("= "); return symbol(sym.EQUAL);}
//     "=="     { System.out.print("== "); return symbol(sym.EQUALS);}
//     "!="     { System.out.print("!= "); return symbol(sym.NOTEQUALS);}
//     "+"      { System.out.print("+ "); return symbol(sym.PLUS);}
//     "-"      { System.out.print("- "); return symbol(sym.MINUS);}
//     "*"      { System.out.print("* "); return symbol(sym.TIMES);}
//     "/"      { System.out.print("/ "); return symbol(sym.DIVIDE);}
//     "if"     { System.out.print("if "); return symbol(sym.IF);}
//     "while"  { System.out.print("while "); return symbol(sym.WHILE);}
//     "return" { System.out.print("return "); return symbol(sym.RETURN);}

//     {Comentario}  { /* ignore */ }
//     {WhiteSpace}  { /* ignore */ }
//     {Number}      { int aux = Integer.parseInt(yytext());
//                     System.out.print(yytext());
//                          return symbol(sym.INT, new Integer(aux)); }
//     {Id}          { System.out.print(yytext());
//                          return symbol(sym.IDENT, new String(yytext()));} 
  

//     /* Don't do anything if whitespace is found */
//     {WhiteSpace}       { /* just skip what was found, do nothing */ }
//     <<EOF>> { return symbol(sym.EOF);}

// .                    { throw new Error("Illegal character <"+yytext()+">"); }

/*
  Macro Declarations

  These declarations are regular expressions that will be used latter
  in the Lexical Rules Section.
*/

/* A line terminator is a \r (carriage return), \n (line feed), or
   \r\n. */
LineTerminator = \r|\n|\r\n

/* White space is a line terminator, space, tab, or line feed. */
WhiteSpace     = {LineTerminator} | [ \t\f]

/* A literal integer is is a number beginning with a number between
   one and nine followed by zero or more numbers between zero and nine
   or just a zero.  */
dec_int_lit = 0 | [1-9][0-9]*

/* A identifier integer is a word beginning a letter between A and
   Z, a and z, or an underscore followed by zero or more letters
   between A and Z, a and z, zero and nine, or an underscore. */
dec_int_id = [A-Za-z_][A-Za-z_0-9]*

%%
/* ------------------------Lexical Rules Section---------------------- */

/*
   This section contains regular expressions and actions, i.e. Java
   code, that will be executed when the scanner matches the associated
   regular expression. */

   /* YYINITIAL is the state at which the lexer begins scanning.  So
   these regular expressions will only be matched if the scanner is in
   the start state YYINITIAL. */

<YYINITIAL> {

    /* Print the token found that was declared in the class sym and then
       return it. */
    "+"                { System.out.print(" + "); return symbol(sym.PLUS); }
    "-"                { System.out.print(" - "); return symbol(sym.MINUS); }
    "*"                { System.out.print(" * "); return symbol(sym.TIMES); }
    "/"                { System.out.print(" / "); return symbol(sym.DIVIDE); }
    "("                { System.out.print(" ( "); return symbol(sym.LPAREN); }
    ")"                { System.out.print(" ) "); return symbol(sym.RPAREN); }

    /* If an integer is found print it out, return the token NUMBER
       that represents an integer and the value of the integer that is
       held in the string yytext which will get turned into an integer
       before returning */
    {dec_int_lit}      { System.out.print(yytext());
                         return symbol(sym.INT, new Integer(yytext())); }

    /* If an identifier is found print it out, return the token ID
       that represents an identifier and the default value one that is
       given to all identifiers. */
    {dec_int_id}       { System.out.print(yytext());
                         return symbol(sym.ID, new Integer(1));}

    /* Don't do anything if whitespace is found */
    {WhiteSpace}       { /* just skip what was found, do nothing */ }
}


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }

