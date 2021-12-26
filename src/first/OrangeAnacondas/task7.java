package first.OrangeAnacondas;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        /*
        Using scanner enter String (any two words) value with
spaces in the beginning and at the end. In this input, the
second word is not starting with the upper case, using string
methods change the letter with upper case and print it
Example 1:
Please enter the String with the following format “ word “
Natural black
The output is:
Natural Black
         */
        System.out.println("Please enter any to words with the following format :"+ "    Hello world    ");
        Scanner input= new Scanner(System.in);
        String word= input.nextLine();
        //we need to delete the space before and after the words
        String words= word.trim();
        System.out.println(words);
        // we will find the index of " "
        int indexOfSpace= words.indexOf(" ");
        //we will get the first word by cutting the string from index of 0 to index of " "
        String word1= words.substring(0,indexOfSpace);
        //we get the second word by cutting the string from index of " "
        String  word2=words.substring(indexOfSpace);
        String word2NoFirstL= word2.substring(2);//second word wihtout the first letter
        String word2firstLetter=word2.substring(1,2);//getting the first letter from the second word
        String w2FirstLettertoUC= word2firstLetter.toUpperCase();// making the first letter from the second word to upper case
        String word2Upper=(" ")+ w2FirstLettertoUC.concat(word2NoFirstL);// combining the firstUpper Case letter with
        // second word
        String updatedWords= word1.concat(word2Upper);//combine first word with second word
        System.out.println(updatedWords);





    }
}
