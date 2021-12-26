package ifStatement;

import java.util.Scanner;

public class NestedIfPractice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("In what city are you living?");
        String city= input.nextLine();
        if (city.equalsIgnoreCase("Chicago")){
            System.out.println("What course do you take?");
            if (input.next().equalsIgnoreCase("Techtorial")) {
                System.out.println("Are you in batch11?");
                if (input.next().equalsIgnoreCase("Yes")) {
                    System.out.println("Congratulation and good luck");
                }else{
                    System.out.println("You should be a good SDET");
                }
            }else {
                System.out.println("You should ask about Techtorial academy");
            }
        }else{
            System.out.println("You should visit Chicago");
        }

    }
}
