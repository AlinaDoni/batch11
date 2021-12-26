package HomeWorkPractice;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        System.out.println("Please enter your grade in letter.");

        Scanner input = new Scanner(System.in);
        String grade = input.nextLine();

        if (grade == "A ") {
            System.out.println("4.0");
        } else if (grade == "A-") {
            System.out.println("3.7");
        } else if (grade == "B+") {
            System.out.println("3.3");
        } else if (grade == "B") {
            System.out.println("3.0");
        } else if (grade == "B-") {
            System.out.println("2.7");
        } else if (grade == "C+") {
            System.out.println("2.3");
        } else if (grade == "C") {
            System.out.println("2.0");
        } else if (grade == "C-") {
            System.out.println("1.7");
        } else if (grade == "D+") {
            System.out.println("1.3");
        } else if (grade == "D") {
            System.out.println("1.0");
        } else if (grade == "F") {
            System.out.println("0.0");
        }
    }
}
