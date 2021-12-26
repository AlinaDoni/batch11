package array;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {

        String str= "Stay safe and Healthy";
         String[] words=str.split(" ");//string is immutable unless we save it
        System.out.println(Arrays.toString(words));
        //print out every single word as :...***
        for (String word : words){
            System.out.println(word.concat("***"));
        }
        String[] word2 = str.split("af", 4);
        System.out.println(Arrays.toString(word2));
        System.out.println(word2.length);

        // 12/17/2021
        // 12-17-2021
        // 12_17_2021
        String date= "12_17_2021";
        String[] splitDate= date.split("_");
        System.out.println(Arrays.toString(splitDate));
        // split 12.17.2021
        String dates= "12.17.2021";
        String[] sdate=dates.split("\\.");//to split somethis that contains . we have to put \\
        System.out.println(Arrays.toString(sdate));

            System.out.println("\"s\"");
            for (String element : sdate){
                System.out.println("\""+element+"\"");
            }




    }
}
