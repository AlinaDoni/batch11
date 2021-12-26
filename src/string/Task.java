package string;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /* by using scanner ask user to provide his/her gender, full name and birth year in the following format
        F - Jenny Brown - 1999
                -check if the string starts with F
                -check if the string ends with M
                -check if the string contains your name
                -check if the string ending with birth year
        -replace '-' with '/'
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you gender, full name and birth year in the following format : " +
                "F - Jenny Brown - 1999 ");
        String info= input.nextLine();
        System.out.println(info.startsWith("F"));
        System.out.println(info.endsWith("M"));
        System.out.println(info.contains("Alina Doni"));
        System.out.println(info.endsWith("2000"));
        System.out.println(info.replace('-', '/'));



    }
}
