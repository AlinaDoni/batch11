package string;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
        //Ask user to enter an integer number
        // we will find out if this is an even number or not
        //inpus is 7
        //output 7 is even number false
        //input is 8
        // output 8 is even number
        Scanner data = new Scanner(System.in);
//        System.out.println("Please enter an integer number i.e 1,2,3---");
//                int number = data.nextInt();
//        //if remainder with 2 gives 0, this number will be even
//        boolean isEven= number%2==0;
//        System.out.println(number+ " is even number " + isEven);

        //ask user to enter two int number
        //first int you provide should be biger than second one
        //if first number is bigger that the second one we will print out true
        //if second number bigger than first number we will print out false
//        System.out.println("enter your first integer number");
//        int firstNumber = data.nextInt();
//        System.out.println("please enter an integer, smaller than first one");
//        int secondNumber = data.nextInt();
//        boolean isFirstBiger = firstNumber> secondNumber;
//        System.out.println(isFirstBiger);

        //to be able to graduate from school student need 85% attendancy
        //and 80 or higher grade
        // and 70%o f homework;
        //create a program for teacher and teacher will enter all this variables and if student passes you will
        //crea true for teacher
        //if student fails you will create false for teacher

        System.out.println("please enter students attendancy");
        int attendancy= data.nextInt();
        System.out.println("enter students grade");
        int grade = data.nextInt();
        System.out.println("enter students homework");
        int homework = data.nextInt();

        // how can i print for all off them
        boolean isGrade = grade >= 80;
        boolean  isAtt = attendancy >= 85;
        boolean isHomework = homework >= 70;
        System.out.println("Grade is"+ isGrade);
        System.out.println("Attendancy is"+ isAtt);

        boolean pass = attendancy >= 85 && grade >=80 && homework >= 70;
        System.out.println("will student pass?"+ pass);



    }
}
