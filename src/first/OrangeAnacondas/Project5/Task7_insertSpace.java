package first.OrangeAnacondas.Project5;

import java.util.Scanner;

public class Task7_insertSpace {
    public static void main(String[] args) {
        /*
        Using a scanner
enter a sentence that is not separated by space and each wordstarts with upper case. Print given String as separated words with spaces.
Example:
Given Value: "IWantToLearnJava"
Output: I Want To Learn Java
Example-2:
Given Value: "ItIsSunnyOutside"
Output: It Is Sunny Outside
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a string value, where each word start with uppercase and " +
                "words are not separated by space");
        String str= input.nextLine();
        String sentence="";

        for (int i=0; i< str.length(); i++){
            char ch= str.charAt(i);
            if (i !=0 && Character.isUpperCase(ch)){
                sentence+= " "+ ch;
            } else{
                sentence+=ch;
            }
            }
        System.out.println(sentence.trim());

    }
}
