package first.OrangeAnacondas;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter the number of quarters ");
        double quarters=input.nextDouble();
        System.out.println("please enter the number of dimes ");
        double dimes=input.nextDouble();
        System.out.println("please enter the number of nickels");
        double nickels=input.nextDouble();
        System.out.println("please enter the number of");
        double pennies=input.nextDouble();

        double dollars =(0.25*quarters)+(0.10*dimes)+(0.05*nickels)+(0.01*pennies);

        System.out.println(dollars);

        //second way
        int quarters1=5;
        int dimes1=4;
        int nickels1=3;
        int pennies1=2;
        System.out.println((quarters1*0.25)+(dimes1*.10)+(nickels1*0.05)+(pennies1*0.01));
    }
}
