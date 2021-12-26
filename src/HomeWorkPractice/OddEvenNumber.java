package HomeWorkPractice;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a string value");
        Scanner input = new Scanner(System.in);
        String word= input.next();
        int length = word.length();
        String middle3= word.substring(word.length()/2-1,word.length()/2+2);

        if(length%2 == 0){
            System.out.println(word.substring(1));
        }else{
            System.out.println(middle3);
        }
}
}