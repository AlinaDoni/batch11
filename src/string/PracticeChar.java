package string;

import java.util.Scanner;

public class PracticeChar {
    //we will ask user to enter a char letter
//if this char taht is not an englsh letter, code should print false
//if user enter english letter code should print true
    public static void main(String[] args) {
        //ASCII table
        //the table that all chars has a unique value
        // if the value of the char is between char a and char z it means this char is a lette
        System.out.println("please enter a char letter");
        char ch= '9';
        //if this ch is a letter or not
        boolean isLetter = ch>= 'a' && ch<='z' || ch>='A' && ch<= 'Z';

        System.out.println(isLetter);

    }
}