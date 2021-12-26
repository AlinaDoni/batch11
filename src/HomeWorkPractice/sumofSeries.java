package HomeWorkPractice;

import java.util.Scanner;

public class sumofSeries {
    public static void main(String[] args) {
        System.out.println("Please enter a number from 1 to 10");
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        String one="";

        int sum=0, total=0;

        while (one.length()<num){

            one+="1";
            sum= (sum*10)+1;
            total+=sum;

        }
        System.out.println(total);
    }
}
