package HomeWorkPractice;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {

        System.out.println("Please enter string with three words");
    Scanner input = new Scanner(System.in);

    String word1= input.next();
    String word2= input.next();
    String word3= input.next();

        System.out.println(word1.charAt(0)+ ""+word2.charAt(0)+""+word3.charAt(0));
        System.out.println(word1.charAt(word1.length()-1)+ ""+ word2.charAt(word2.length()-1)+ "" + word3.charAt(word3.length()-1));
        System.out.println(word1.length()+ "" + word2.length()+ ""+ word3.length());

}
}
