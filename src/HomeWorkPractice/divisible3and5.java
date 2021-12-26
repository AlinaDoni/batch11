package HomeWorkPractice;

import java.util.Scanner;

public class divisible3and5 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a starting number");
        int num1=input.nextInt();
        System.out.println("Enter an ending number");
        int num2=input.nextInt();
        int count=0;

        while(num1<num2){

            if(num1%3==0 && num1%5==0){
                count++;
            }
            num1++;

        }
        System.out.println(count);
    }
}
