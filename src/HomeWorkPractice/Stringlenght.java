package HomeWorkPractice;

import java.util.Scanner;

public class Stringlenght {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String word= input.next();
        /*
        If string length is bigger than or equals to 3
         print the string without first and last char.
         If the length is smaller than 3 print print as it is. (For this task you need to use if statement).
         */
        if (word.length()>= 3){
            System.out.println(word.substring(1,word.length()-2));
        } else {
            System.out.println(word);
        }
    }
}
