package loops.while_DoWhile;

import java.util.Scanner;

public class whilePractice1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int myAge= 21;
        while (myAge<=26){
            System.out.println("My age is "+ myAge++);
        }
        //print out numbers between 10 to 20
        int n= 10;
                while(n<=20){
                    System.out.println(n++);
                }
    }
}
