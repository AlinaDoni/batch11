package ifStatement;

import java.util.Scanner;

public class IfPractice3 {
    public static void main(String[] args) {
        //ask user to enter a single word
        //if the word's first letter is:
        //M--> there is a dai starts with M>> Monday
        ///                               T>> tuesday. thursday
        ///                               W>> Wednesday
        ///                               F>> Friday
        ///                               S>> Saturday/Sunday
        // if l none of this letetr wil match inform user
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a word");
        String word= input.nextLine().toUpperCase();


        if (word.startsWith("M")){
            System.out.println("There is a day starts with M witch is Monday");
        }
        if (word.startsWith("T")){
            System.out.println("There is a day starts with T witch is Tuesday and Thursday");
        }
        if (word.startsWith("W")){
            System.out.println("There is a day starts with W witch is Wednesday");
        }
        if (word.startsWith("F")){
            System.out.println("There is a day starts with F witch is Friday");
        }
        if (word.startsWith("S")){
            System.out.println("There is a day starts with S witch is Saturday and Sunday");
        }
        if(!word.startsWith("M") && !word.startsWith("T") && !word.startsWith("W") && !word.startsWith("F") && !word.startsWith("S")){
            System.out.println("There is no day");

        }
    }
}
