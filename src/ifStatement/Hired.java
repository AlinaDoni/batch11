package ifStatement;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {
        /*==Task==

  nested if >>>> java>selenium>API>Sql>Appium ornegi
  ask user:
        -s/he knows Java yes/no
                yes: ask s/he knows Selenium

                        can learn: ask s/he has API testing experience
                        yes: ask s/he has API testing experience
                        no: we need someone who is familiar with Selenium
                                yes: ask s/he has Sql knowledge
                                        yes: "Congrat!! You are HIRED!!"
                                        no: We need someone who has Sql knowledge */
        Scanner input = new Scanner(System.in);
        System.out.println("Do you know Java?");
        String know = input.nextLine();
        if (know.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium?yes/no/learn");
            String selenium = input.nextLine();
            if (selenium.equalsIgnoreCase("yes") || selenium.equalsIgnoreCase("learn")) {
                System.out.println("Do you have API testing experience");
                String api = input.nextLine();
                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Do you have Sql knowledge?yes/no");
                    String sql = input.next();
                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("Congrats!! You are HIRED!");

                    } else {
                        System.out.println("We need someone who has Sql knowledge");
                    }

                } else {
                    System.out.println("We need someone with API knowledge");

                }
            } else {
                System.out.println("We need someone with Selenium");
            }
        } else {
            System.out.println("We need someone who is familiar with Java");
        }
    }
}
