package loops.while_DoWhile;

import java.util.Scanner;

public class whilePractice3 {
    public static void main(String[] args) {
        System.out.println("Please enter a word");
        Scanner input= new Scanner(System.in);
        String word = input.next();
        int ch= 0;
        while (ch< word.length()) {
            System.out.print(word.charAt(ch)+ ", ");
            ++ch;
        }
        System.out.println();
        //print those letter from end to begining
        int indlLetter= word.length()-1;
        while (indlLetter>=0) {
            System.out.print(word.charAt(ch)+ ", ");
            --indlLetter;
        }
    }
}
