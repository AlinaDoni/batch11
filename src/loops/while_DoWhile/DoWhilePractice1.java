package loops.while_DoWhile;

import java.util.Scanner;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        //find and show sum of the number between 10 to 20 by using do-while
        int a= 10;
        int b=20;
        int sum=0;

        do{
            sum+=a;
            a++;
            System.out.println("your sum now is "+ sum);
        }while (a<=b);
        System.out.println("your sum is "+ sum
        );
        /*  -Ask user to provide a number between 3 to 10
  - make a star tree for that many line
  (Use Do-While Loop to implement solution)
    ex: input --> 4
                  *
                  **
                  ***
                  ****

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number between 3 to10");
        int n= input.nextInt();
        String tree= "*";
        int count=0;
        if(n>=3 && n<=10) {
            do {
                System.out.println(tree);
                tree += "*";
                count++;
            } while (count <= n);
        }

    }
}
