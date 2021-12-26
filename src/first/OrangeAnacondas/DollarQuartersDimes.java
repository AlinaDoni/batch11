package first.OrangeAnacondas;

import java.util.Scanner;

public class DollarQuartersDimes {
    public static void main(String[] args) {
//I need to write a program that will take a given amount
//of money and return the number of dollars in quarters,
//dimes, nickels, and pennies that make up that given
//amount
//Example 1:
//Please enter your balance:
//2.36
//$2.36 will make 9 quarters 1 dime 0 nickels and 1
//pennies
//Description
  //utput:
        //$5.22 will make 20 quarters 2 dimes 0 nickels and 2 pennies


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the exact dollar amount");
        double amount= input.nextDouble();
        int coinsTotal=(int)(amount * 100);//we calculate the total amount in coins by multiplying dollar amount to 100
        // we calculate each kind of coins by diving total amount of coins to value of each coin
        int quarters=coinsTotal/25;
        int centsRemaining = coinsTotal -(quarters*25);//every time we update the remaining coins from out total amount
        int dimes = centsRemaining/10;
        centsRemaining -=(dimes*10);
        int nickels =centsRemaining/5;
        centsRemaining-= (nickels * 5);
        int pennies = centsRemaining;

        System.out.println("&"+ amount+" will make "+ quarters+ " quarters "+dimes+" dimes "+nickels+" nickels and "+ pennies+ " pennies" );



    }
}
