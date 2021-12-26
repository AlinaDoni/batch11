package loops.while_DoWhile;

import java.util.Scanner;

public class taskUpperCase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a word with lower cases and upper cases");
        String word= input.next();
        String upperWord= word.toUpperCase();
        int leng= word.length();
        int index= 0;
        int upperCases= 1;
        while (index<leng){
            if (word.charAt(index)== upperWord.charAt(index)){

                System.out.println("In your word are "+ upperCases + " upper case letters");
            } index++; upperCases++;

        }
    }
}
