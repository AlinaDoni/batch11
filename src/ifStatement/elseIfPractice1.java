package ifStatement;

import java.util.Scanner;

public class elseIfPractice1 {
    public static void main(String[] args) {
        /*
        get three test results from user and calculcate the average of those 3 tests based on the average score
        print out letter grade for this studens, grates are:
         average 100-90 --> your letter grade is A
         average 89-80--> your letter grade is B
                 79-60 --->      C
                 less than 60---> you should take the course again
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your first test result as a 0-100");
        double test1= input.nextDouble();
        System.out.println("Please enter your second test result as a 0-100");
        double test2= input.nextDouble();
        System.out.println("Please enter your fird test result as a 0-100");
        double test3= input.nextDouble();
        double average= (test1+test2+test3)/3;
        if (average<=100 && average>=90){
            System.out.println("Your letter grade is A");
        }else if (average<=89 && average >=80){
            System.out.println("Your letter grade is B");
        }else if(average<=79 && average>=60){
            System.out.println("Your letter grade is C");
        }else {
            System.out.println("You should take this course again");
        }
    }
}
