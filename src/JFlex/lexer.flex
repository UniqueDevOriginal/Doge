// package JFlex;
// import java_cup.runtime.*;
// import JCup.*;

// %%

// /* -----------------Opções e declarações do JFlex----------------- */

// /*
//    O nome da classe que JFlex criará será Lexer.
//    Escreve o código no arquivo Lexer.java.
// */
// %public
// %class Lexer

// /*
//   O número da linha atual pode ser acessado com a variável yyline
//   e o número da coluna atual com a variável yycolumn.
// */
// %line
// %column

// /*
//    Compatibilidade para o JCUP para fazer interface com o analisador gerado.
// */
// %cup

// /*
//   Código entre %{ e %}, são usados para incluir código Java dentro da classe do scanner.
// */
// %{
//     /* Criar um novo simbolo com informações sobre token, sem valor */
//     private Symbol symbol(int type) {
//         return new Symbol(type, yyline, yycolumn);
//     }

//     /* Criar um novo simbolo com informações sobre token, com valor */
//     private Symbol symbol(int type, Object value) {
//         return new Symbol(type, yyline, yycolumn, value);
//     }
// %}

// %eofclose

// /*
//    Macros que serão usadas no código gerado pelo JFlex.
//    expressões regulares que serão usadas posteriormente
// */
// NewLine = \r|\n|\r\n
// WhiteSpace = {NewLine} | [ \t\f]
// Alpha  = [|a-z|]
// Character = [\'][{Alpha}][\']
// Digit = [0-9]
// Number =  0 | [1-9][0-9]*
// AlphaNum = [{Alpha}|{Digit}]
// Id = {Alpha}{AlphaNum}*
// Comentario = "$"[^\n]*
// // String = [\"][^\n\"]+[\"]


// %%
// /* ------------------------Regras do scanner---------------------- */

//     /* Print the token found that was declared in the class sym and then
//        return it. */
   

//     "show"  { print_token("show "); return symbol(sym.SHOW);}
     
//     {Comentario}     { /* ignore */ }
//     {WhiteSpace}     { /* ignore */ }
//     {Character} { print_token(yytext()); return symbol(sym.CHARACTER);}
//     {Number}    { print_token(yytext()); return symbol(sym.INT);}
//     {Id} { print_token(yytext());return symbol(sym.ID, new String(yytext()));} 
    
//     <<EOF>> { print_token("<<EOF>>"); return symbol(sym.EOF);}   
//     . [^]                    { throw new Error("Illegal character <"+yytext()+">"); }

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


/*
   Macros que serão usadas no código gerado pelo JFlex.
   expressões regulares que serão usadas posteriormente
*/

/* Nova linha representada por \r, \n ou \r\n */
NewLine = \r|\n|\r\n

/* tanto uma nova linha como um tab \t u um \f são
   considerados espaçoes em branco */
WhiteSpace = {NewLine} | [ \t\f]

/* alfabeto de a-z */ 
Alpha  = [|a-z|]

/* caracter ficam entre aspas simples */
Character = [\'][{Alpha}][\']

/* digitos entre 0 - 9 */
Digit = [0-9]

/* numeros 0 ou as combinacoes de 1-9 com 0-9 */
Number =  0 | [1-9][0-9]*

/* união do alfabeto com os digitos */
AlphaNum = [{Alpha}|{Digit}]

/* ids são combinaçoes de letras podendo ou não ser seguido de numeros
   mas nunca ter numero como prefixos */
Id = {Alpha}{AlphaNum}*

/* tudo após um simbolo $ até o \n é considerado Comentario */
Comentario = "$"[^\n]*
// String = [\"][^\n\"]+[\"]

%%
/* ------------------------Lexical Rules Section---------------------- */


    ";"      { System.out.print(" ; "); return symbol(sym.SEMI);}
    "char"   { System.out.print("char "); return symbol(sym.CHAR);}
    "int"    { System.out.print("int "); return symbol(sym.INT);}
    "void"   { System.out.print("void "); return symbol(sym.VOID);}
    "("      { System.out.print("( "); return symbol(sym.LEFTPAREN);}
    ")"      { System.out.print(") "); return symbol(sym.RIGHTPAREN);}
    "{"      { System.out.print("{ "); return symbol(sym.LEFTBRACE);}
    "}"      { System.out.print("} "); return symbol(sym.RIGHTBRACE);}
    ","      { System.out.print(", "); return symbol(sym.COMMA);}
    "<"      { System.out.print("< "); return symbol(sym.LESS);}
    ">"      { System.out.print("> "); return symbol(sym.GREATER);}
    "="      { System.out.print("= "); return symbol(sym.EQUAL);}
    "=="     { System.out.print("== "); return symbol(sym.EQUALS);}
    "!="     { System.out.print("!= "); return symbol(sym.NOTEQUALS);}
    "+"      { System.out.print("+ "); return symbol(sym.PLUS);}
    "-"      { System.out.print("- "); return symbol(sym.MINUS);}
    "*"      { System.out.print("* "); return symbol(sym.TIMES);}
    "/"      { System.out.print("/ "); return symbol(sym.DIVIDE);}
    "if"     { System.out.print("if "); return symbol(sym.IF);}
    "while"  { System.out.print("while "); return symbol(sym.WHILE);}
    "return" { System.out.print("return "); return symbol(sym.RETURN);}

    {Comentario}  { /* ignore */ }
    {WhiteSpace}  { /* ignore */ }
    {Number}      { int aux = Integer.parseInt(yytext());
                    System.out.print(yytext());
                         return symbol(sym.INT, new Integer(aux)); }
    {Id}          { System.out.print(yytext());
                         return symbol(sym.IDENT, new String(yytext()));} 
  

    /* Don't do anything if whitespace is found */
    {WhiteSpace}       { /* just skip what was found, do nothing */ }
    <<EOF>> { return symbol(sym.EOF);}

.                    { throw new Error("Illegal character <"+yytext()+">"); }
