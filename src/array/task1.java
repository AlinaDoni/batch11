package array;

import java.util.Arrays;
import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        /*
        -ask user, how many names that s/he wants to store in array
-store those names by getting it from user in to array that is called 'names'
    if the names had 5 or more letters store it in "lonNames" array
    if the name has less than 5 letter stor in "shortNames" array
-print them out by using ->Arrays.toString(); method
         */
        Scanner input= new Scanner(System.in);
        System.out.println("How many people are coming at your party?");
        int people= input.nextInt();
        String[] name = new String[people];
        input = new Scanner(System.in);



        for (int i=0 ; i< people; i++){
            System.out.println("enter "+ (i+1)+ " . name");

           name[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(name));
    }

}
