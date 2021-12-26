package ifStatement;

import java.util.Scanner;

public class elsePractice1 {
    public static void main(String[] args) {
        //==Task===
        //    when your order total is more than $1000 you get %20 discount, other wise you get %5 discount
        //        calculate and print total discount and payment in each case

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your total amount");
        double total= input.nextDouble();
        double discount20=total- ((total * 20)/100);
        double discount5= total-((total*5)/100);
        double saved1=total-discount20;
        double saved2= total - discount5;


        if(total>=1000) {
            System.out.println("You get 20% discoun and your total is " + discount20+ "you saved "+ saved1);
        }else {
            System.out.println("You get 5% discount and your total is "+ discount5 + "you saved"+ saved2);
        }

        //task: find out if your zip code is even number or add number
        System.out.println("Please enter your zip code");
        int zip = input.nextInt();



        if (zip%2 == 0){
            System.out.println("Your zipcode is even number");
        } else{
            System.out.println("Your zip code is add number");
        }


    }
}
