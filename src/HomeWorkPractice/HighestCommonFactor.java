package HomeWorkPractice;

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        /*
        Write a java program to find HCF (Highest Common Factor) of two numbers. Test Data : Input 1:
        24 Input 2: 28 Expected Output : 4 -> Because HCF of 24 and 28 is 4 Input 1: 75 Input 2:
        45 Expected Output : 15 -> Because HCF of 75 and 45 is 15

NOTE : Highest Common Factor means biggest common divident of two number.
         */

        System.out.println("Enter the number 1");
        Scanner input= new Scanner(System.in);
        int num1= input.nextInt();
        System.out.println("Enter the number 2");
        int num2=input.nextInt();
        int HCF=1;
        for(int i=1; i<=num1 || i<=num2; i++){
            if(num1%i==0 && num2%i==0){
                HCF=i;

            }
        }
        System.out.println(HCF);
    }
}
