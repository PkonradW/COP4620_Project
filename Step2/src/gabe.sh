#!/bin/bash
java org.antlr.v4.Tool Little.g4
javac *.java

echo Executing Driver Files:
dir=`pwd`

for file in $inputs/*.out; do FILENAME=`basename ${file%%.*}`;
  echo Executing Files
  java Driver "inputs/${FILENAME}.micro" "myOutput/${FILENAME}.out"
  echo Comparing Files
  diff -B -b -s outputs/${FILENAME}.out myOutput/${FILENAME}.out
  echo
done