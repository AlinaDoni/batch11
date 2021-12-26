package string;

import java.util.Locale;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        //we will ask user for their first name
        //we wil ask last name
        //we will print first name in lower case
        //last name upper case
        //.toLowerCase() --> makes all letter to lower case
        //.toUpperCase(); --> makes all letter upper case
        String str = "alina";
        str.toUpperCase();
        // if you don't reasign the string it will not change its value

        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName= input.nextLine();
        System.out.println("please enter your last name");
        String lastName = input.nextLine();

        //when we use nestline() we can enter multiple words
         //when  we use next() it will not take more than one word


        System.out.println(firstName.toLowerCase() + lastName.toUpperCase());
        System.out.println(firstName);

//        firstName = firstName.toLowerCase();
//        lastName = lastName.toUpperCase();
//        System.out.println(firstName +" "+   lastName);


        //Scanner input

    }
}
