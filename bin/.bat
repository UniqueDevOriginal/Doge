cd JCup
del /f parser.java 
del /f sym.java
java -jar java-cup-11b.jar parser.cup
cd ../JFlex
del /f Lexer.java
java -jar jflex-full-1.8.2.jar lexer.flex