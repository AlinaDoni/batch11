package string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        System.out.println("Welcome");

        String name = " Alina";
        System.out.println("My name is "+name);

        //creating scanner object
        Scanner input = new Scanner(System.in);// creating a scanner object
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();
        System.out.println(lastName);

        //task: ask user to enter hs/her city name and print as : "<name><lastName> your are living in <city>

        System.out.println(" Please enter your city name ");
        String city = input.nextLine();

        System.out.println( name+" " + lastName+ " your are living in " + city);
        System.out.println(" Please enter your age ");

        int age = input.nextInt();
        System.out.println("Hey "+ name + " you look younger than  "+ age+ " are you working out?");
        System.out.println("Please enter your height in feet and inches(i.e 5.8)");

       double height= input.nextDouble();
        System.out.println("your height is perfect for a model "+ height);
        System.out.println("Please enter your adress");
        //input = new Scanner(System.in);
        input.nextLine();
        String adress= input.nextLine();

        System.out.println("is this correct adress you provided "+ adress);







    }
}