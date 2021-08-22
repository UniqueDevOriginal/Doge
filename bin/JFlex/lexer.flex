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


/*
   Macros que serão usadas no código gerado pelo JFlex.
   expressões regulares que serão usadas posteriormente
*/

NewLine = \r|\n|\r\n
WhiteSpace = {NewLine} | [ \t\f]
Alpha  = [|a-z|]
Digit = [0-9]
// Number = [0-9]|[1-9][0-9]*
AlphaNum = [{Alpha}|{Digit}]
Id = {Alpha}{AlphaNum}*
// Comentario = "$"[^\n]*
// String = [\"][^\n\"]+[\"]




%%
/* ------------------------Regras do scanner---------------------- */


<YYINITIAL> {

    /* Print the token found that was declared in the class sym and then
       return it. */
   
    ";"    { System.out.print(" ; "); return symbol(sym.SEMI);}
    "char" { System.out.print(" char "); return symbol(sym.CHAR);}
    "int"  { System.out.print(" int "); return symbol(sym.INT);}
    "("    { System.out.print(" ( "); return symbol(sym.LEFTPAREN);}
    ")"    { System.out.print(" ) "); return symbol(sym.RIGHTPAREN);}
    "{"    { System.out.print(" { "); return symbol(sym.LEFTBRACE);}
    "}"    { System.out.print(" } "); return symbol(sym.RIGHTBRACE);}
    "main" { System.out.print(" main "); return symbol(sym.MAIN);}
    
    {WhiteSpace}     { /* ignore */ }
    {Id} { System.out.println(yytext());return symbol(sym.IDENT, new String(yytext()));} 
    
    <<EOF>> { System.out.println("<<EOF>>"); return symbol(sym.EOF);}   
    . { throw new Error("Illegal character <"+yytext()+">"); }

    
   //   {LineTerminator}    { System.out.print(yytext());
   //                       return symbol(sym.NEWLINE, new Integer(yytext()));}

   //  /* If an integer is found print it out, return the token NUMBER
   //     that represents an integer and the value of the integer that is
   //     held in the string yytext which will get turned into an integer
   //     before returning */
   //  {dec_int_lit}      { System.out.print(yytext());
   //                       return symbol(sym.INT, new Integer(yytext())); }

   //  /* If an identifier is found print it out, return the token ID
   //     that represents an identifier and the default value one that is
   //     given to all identifiers. */
   //  {dec_int_id}       { System.out.print(yytext());
   //                       return symbol(sym.ID, new Integer(1));}

   //  /* Don't do anything if whitespace is found */
   //  {WhiteSpace}       { /* just skip what was found, do nothing */ }
}


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */

