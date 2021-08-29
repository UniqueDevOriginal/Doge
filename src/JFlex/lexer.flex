package JFlex;
/* ------------------------------Declaração de bibliotecas---------------------------------- */
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
         System.out.print("teste"+"< "+"token_name+" >");         
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

/*Faz com que o JFlex feche o fluxo de entrada no final do arquivo.*/
// %eofclose

/*
   Macros que serão usadas no código gerado pelo JFlex.
   expressões regulares que serão usadas posteriormente
*/
NewLine = \r|\n|\r\n
WhiteSpace = {NewLine} | [ \t\f]
Alpha  = [|a-z|]
Character = [\'][{Alpha}][\']
Digit = [0-9]
Number = [0-9]|[1-9][0-9]*
AlphaNum = [{Alpha}|{Digit}]
Id = {Alpha}{AlphaNum}*
Comentario = "$"[^\n]*
// String = [\"][^\n\"]+[\"]


%%
/* ------------------------Regras do scanner---------------------- */

     /*----------Definição dos Tokens----------*/

    /* Imprime o token encontrado que foi declarado na classe sym e retorna. */
   
   /* ----------Tipos (Também São Palavras Reservadas)---------*/
    "char"   { print_token("char "); return symbol(sym.CHAR);}
    "int"    { print_token("int "); return symbol(sym.INT);}
    "void"   { print_token("void "); return symbol(sym.VOID);}

   /* ----------Delimitadores---------*/
    "("      { print_token("( "); return symbol(sym.LEFTPAREN);}
    ")"      { print_token(") "); return symbol(sym.RIGHTPAREN);}
    "{"      { print_token("{ "); return symbol(sym.LEFTBRACE);}
    "}"      { print_token("} "); return symbol(sym.RIGHTBRACE);}
    ";"      { print_token("; "); return symbol(sym.SEMI);}

   /* ----------Operadores---------*/
    ","      { print_token(", "); return symbol(sym.COMMA);}
    "<"      { print_token("< "); return symbol(sym.LESS);}
    ">"      { print_token("> "); return symbol(sym.GREATER);}
    "="      { print_token("= "); return symbol(sym.EQUAL);}
    "=="     { print_token("== "); return symbol(sym.EQUALS);}
    "!="     { print_token("!= "); return symbol(sym.NOTEQUALS);}
    "+"      { print_token("+ "); return symbol(sym.PLUS);}
    "-"      { print_token("- "); return symbol(sym.MINUS);}
    "*"      { print_token("* "); return symbol(sym.TIMES);}
    "/"      { print_token("/ "); return symbol(sym.DIVIDE);}

   /* ----------Palavras Reservadas---------*/
    "if"     { print_token("if "); return symbol(sym.IF);}
    "while"  { print_token("while "); return symbol(sym.WHILE);}
    "return" { print_token("return "); return symbol(sym.RETURN);}
    "show"  { print_token("show "); return symbol(sym.SHOW);}
     
     /*----------Comentário e Espaço em Branco----------*/
    {Comentario}     { /* ignore */ }
    {WhiteSpace}     { /* ignore */ }

   /* ----------Char Literal---------- */
    {Character} { print_token(yytext()); return symbol(sym.CHARACTER);}

   /* ----------Int Literal---------- */
    {Number}    { print_token(yytext()); return symbol(sym.NUMBER);}

    /* ----------Identificador---------- */
    {Id} { print_token(yytext());return symbol(sym.IDENT, new String(yytext()));} 
    
    /*---------Final do Arquivo---------*/
    <<EOF>> {return symbol(sym.EOF);}   
    
    /*---------Retorna erro léxico---------*/
    . { throw new Error("\033[0;31m"+"Illegal character <"+yytext()+">"+" in line "+(yyline+1)+", column "+(yycolumn+1)+"\033[0m"); }