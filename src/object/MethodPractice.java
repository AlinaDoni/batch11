package object;

import javax.swing.plaf.ColorUIResource;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MethodPractice {
    /*

    `create a method that will calculate age of a person,
    `does not return age,
    `will take birth year as parameter,
    `user provides the birth year
    `will print age of person
     */


    public void ageCalculator( int birthYear){
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Please enter your birth year");
//
//        birthYear= scanner.nextInt();

        int age= LocalDateTime.now().getYear()-birthYear;
        System.out.println("Your age is: "+ age);

    }
    // overload age cal by passing name of the prson and return age

    public int ageCaulculator(String name, int birthYear){

        int age= LocalDateTime.now().getYear()-birthYear;
        System.out.println("OverLoaded age calculator: "+ age);
        return age;
    }
    // create a method that will take int array as a parameter and will calculate sum
    //of the numbers in this array, it will return the sum as double
    public double SumOfArray(int[] numbers){
        double sum =0;
        for (int num: numbers) {
         sum+=num;
       }
        return sum;
    }












    public static void main(String[] args) {
        MethodPractice object2= new MethodPractice();
        object2.ageCalculator(2011);

        int[] nums= {1,2,3,4,5,6,7};
      double v=  object2.SumOfArray(nums);
        System.out.println(object2.SumOfArray(nums));
        System.out.println(v);

        double w= object2.SumOfArray(new int[]{1,2,3,4});
        System.out.println(w);


    }



}
