package HomeWorkPractice;

import java.util.Scanner;

public class MirrorPractice {
    public static void main(String[] args) {
        System.out.println("Enter a string value");
        Scanner input= new Scanner(System.in);
        String word= input.nextLine();
        String result="";
        for(int j=0, k=word.length()-1; j< word.length()
                ;j++, k--){
            if (word.charAt(j) == word.charAt(k)){
                result+=word.charAt(j);

            }
            else{
                j=word.length();
            }
        }


        System.out.println(result);

        }

    }
