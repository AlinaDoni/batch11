package first.OrangeAnacondas.Project5;

import java.util.Scanner;

public class Task1_reverseString {
    public static void main(String[] args) {
        /*
        Reverse a given String and return it, if they have space in the
beginning and at the end then remove it.
Example:  " Job" -> "boJ"
 * " Happy " -> "yppaH"
 * "Sun " -> "nuS"
 * " Dream Job!" -> "!boJ maerD"
         */
        System.out.println("Enter a string");
        Scanner input= new Scanner(System.in);
        String word= input.nextLine();
        String reverse="";
        for (int index=word.length()-1; index>=0 ; index--){
            reverse+=word.charAt(index);
        }
        System.out.println(reverse);

    }
}
