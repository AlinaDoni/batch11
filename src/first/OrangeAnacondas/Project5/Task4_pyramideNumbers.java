package first.OrangeAnacondas.Project5;

import java.util.Scanner;

public class Task4_pyramideNumbers {
    public static void main(String[] args) {

   /* Ask the user to enter one number between 1 to 10 then, Write the
    program to print the string in the following format:
    Example:
    Input: 5
    Output:
            1
            22
            333
            4444
            55555
    */
        System.out.println("Enter a number  between 1 to 10");
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();

        for (int lines=1; lines <=num; lines++){
            for (int i=1 ; i<=lines; i++){
                System.out.print(lines);
            }
            System.out.println();


        }




}
}
