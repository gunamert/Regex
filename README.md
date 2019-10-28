# Regex


In this code, I wrote a Java program that performs the following operations on an input file. 
I use regular expressions and Java Regex package to define patterns for searching or manipulating strings. 
The program  perform the below operations on a given input file, make necessary changes on all matching strings and produce a new output file.
The input file might contain one or more sentences per line.

1) Remove mentions as a whole (e.g., “today @school is closed” to “today is closed”) and all hashtag symbols (e.g., “today #school is closed” to “today school is closed”).
2) Remove all URL’s (e.g., “http://mef.edu.tr/registration”, “www.mef.edu.tr, “https://mef.edu.tr/students”) and lines that consist of only punctuations (e.g. “...”).
3) Separate all pairs in the form of “1-try”, “100-notry” by using whitespaces (“1 – try” and “100 – notry”).
4) Replace all numbers with the term “NUMBER” (e.g., 100 students are coming from 3 different countries” to “NUMBER students are coming from NUMBER different countries”).
5) Replace more than three occurences of a letter with that letter (e.g., “oooowwoooo such a wonderful dayyy” to “owwo such a wonderful day”).


