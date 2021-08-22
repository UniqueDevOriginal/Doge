#!/bin/bash
cd src/JCup
sudo rm parser.java && rm sym.java
java -jar java-cup-11b.jar parser.cup

cd ../JFlex
sudo rm Lexer.java
java -jar jflex-full-1.8.2.jar lexer.flex
<<<<<<< HEAD:bin/.bat
cd ..\
=======
>>>>>>> e1b5afcde68ba0d844c9495e769943779211e40a:aqui.sh
