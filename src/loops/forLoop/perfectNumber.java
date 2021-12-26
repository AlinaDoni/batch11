package loops.forLoop;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        //perfect number
        //if sum of the divisor(except itself)equals  to number, it is called perfect number

        int n= 58;
        int sum=0;

        for (int divisor =1; divisor<= n/2; divisor++){

            if (n % divisor == 0){
                sum+=divisor;
            }

        }
        if(n== sum){
            System.out.println(n+ " is a perfect number");
        } else {
            System.out.println( n+ " is not a perfect number");
        }

    }
}
