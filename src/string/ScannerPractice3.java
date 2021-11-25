package string;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        // use scanner to get name and year of birth of user
        //calculate user's age
        //print <you are <age> years old>

        Scanner data = new Scanner(System.in);
        System.out.println("Please enter your name");
       String  name = data.nextLine();
        System.out.println(name+ " please enter your year of birth");
        int year = data.nextInt();
        int age = 2021 - year;
        System.out.println(name+ " Your are "+age + " years old" );

        int currentYear = LocalDateTime.now().getYear();
        System.out.println(currentYear);
        int currentMinute = LocalDateTime.now().getMinute();
        System.out.println(currentMinute);
    }
}
