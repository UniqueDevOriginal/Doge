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

   private void print_token(String token_name) {
         System.out.println(token_name);         
   }

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

    /* Print the token found that was declared in the class sym and then
       return it. */
   
    ";"    { print_token("; "); return symbol(sym.SEMI);}
    "char" { print_token("char "); return symbol(sym.CHAR);}
    "int"  { print_token("int "); return symbol(sym.INT);}
    "("    { print_token("( "); return symbol(sym.LEFTPAREN);}
    ")"    { print_token(") "); return symbol(sym.RIGHTPAREN);}
    "{"    { print_token("{ "); return symbol(sym.LEFTBRACE);}
    "}"    { print_token("} "); return symbol(sym.RIGHTBRACE);}
    ","    { print_token(", "); return symbol(sym.COMMA);}
    
    {WhiteSpace}     { /* ignore */ }
    {Id} { print_token(yytext());return symbol(sym.IDENT, new String(yytext()));} 
    
    <<EOF>> { print_token("<<EOF>>"); return symbol(sym.EOF);}   
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


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */

