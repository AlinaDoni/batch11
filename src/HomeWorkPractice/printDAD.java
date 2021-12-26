package HomeWorkPractice;

import java.util.Scanner;

public class printDAD {
    public static void main(String[] args) {
        /*
        Using scanner ask user to provide the string value.
        Print "dad" if the given string contains the "dad", but where the middle 'a'
        char can be any char otherwise please do not print anything.
        Please look carefully examples below.
        Example: Input the year: testdadtest Output :dad
        Input the year: testd7dtest Output :dad
        Input the year: testdodtest Output :dad Input the year: testDudtest Output :dad
         */

        System.out.println("Enter a string value");
        Scanner input= new Scanner(System.in);
        String word= input.next().toLowerCase();
//        String wordDad= word.substring(word.indexOf('d'),(word.lastIndexOf('d')+1));
//        System.out.println(wordDad);
//       char mChar= word.charAt(word.length()/2-1);
//       String dad= wordDad.replace(mChar,'a');
//        System.out.println(dad);
        //if (word.subSequence('d','d')){
        String dadWord= "dad";
        int secondD=word.lastIndexOf("d");
        int firstD=secondD-2;
        char d1=word.charAt(secondD);
        char d2=word.charAt(secondD-2);
//        char maybeA=word.charAt(secondD-1);
//        String dad= word.substring(firstD,secondD);
//        boolean result1= d1 == 'd';
//        boolean re

        if (d1 == 'd' && d2== 'd') {
            System.out.println("dad");
        } else{
            System.out.println();
        }


        }

        }





