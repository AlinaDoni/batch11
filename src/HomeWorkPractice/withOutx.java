package HomeWorkPractice;

import java.util.Scanner;

public class withOutx {
    public static void main(String[] args) {
        System.out.println("Enter a string value");
        Scanner input= new Scanner(System.in);
        String word=input.next();

        if( word.startsWith("x")&& word.charAt(1) == 'x'){
            System.out.println(word.substring(2));
        } else if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }else if(word.charAt(1)== 'x'){
            System.out.println(word.substring(0,1)+ word.substring(2));
        } else {
            System.out.println(word);
        }

    }
}
