package HomeWorkPractice;

import java.util.Scanner;

public class containsRedBlue {
    public static void main(String[] args) {
        System.out.println("Enter a string value");
        Scanner input = new Scanner(System.in);
        String word = input.next().toLowerCase();

        boolean resultRed = word.contains("r") && word.contains("e") && word.contains("d");

        boolean resultBlue = word.contains("b") && word.contains("l") && word.contains("u") && word.contains("e");

        if (resultRed) {
            System.out.println("red");
        } else if (resultBlue) {
            System.out.println("blue");
        }
    }
}
