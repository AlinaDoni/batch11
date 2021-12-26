package first.OrangeAnacondas.Project5;

import java.util.Arrays;
import java.util.Scanner;

public class Task6_printUniqueLetter {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to enter one string value and print only
        unique letters combined as String also without any space in the beginning and at the end.
Example -1 :
Given Value: "i am happy"
Output: i am hpy
Example-2:
Given Value: " contribute"
Output: contribue
Example-3:
Given Value: " i want cup of coffee "
Output: i want cup of e
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one string value");
        String str = input.nextLine().trim();
        String word = "";


        for (int i = 0; i < str.length(); i++) {
                if (word.indexOf(str.charAt(i)) <0 || str.charAt(i)== ' '){
                    word= word+ str.charAt(i);
                }
            }

        System.out.println(word);


    }
}
