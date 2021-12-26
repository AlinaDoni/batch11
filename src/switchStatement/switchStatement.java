package switchStatement;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        /*
       Ask user for his/her favorite fruit
-you have: mango, banana, kiwi, orange, apple, grape
if you have user's favorite fruit, --> We have your favorite fruit in our store
-orher wise: Sorry, we don't have your favorite fruit :( :
         */
        Scanner input= new Scanner(System.in);
        System.out.println("What's your favorite fruit? ");
        String fruit = input.next().toLowerCase();



        switch (fruit){
            case "mango":
                System.out.println("we have your favorite fruit in our store");
                break;
            case "banana" :
                System.out.println("we have your favorite fruit in our store");
                break;
                case "kiwi" :
                System.out.println("we have your favorite fruit in our store");
                break;
            case "orange" :
                System.out.println("we have your favorite fruit in our store");
                break;
            case "apple" :
                System.out.println("we have your favorite fruit in our store");
                break;
            case "grape" :
                System.out.println("we have your favorite fruit in our store");
                break;
            default:
                System.out.println("we do not have your favorite fruit in our store");

        }
    }
}
