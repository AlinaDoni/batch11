package array;

import java.util.Arrays;

public class forEachPractice {
    public static void main(String[] args) {

        int[] numbers={45,23,5,7,21,66,100};
        //print out each element from this array by using for each loop
        for (int i=0; i<=numbers.length-1; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("==========");
        for (int num : numbers){
            System.out.println(num);
        }

        System.out.println("================");
        String str[]= {"rose", "lily", "orchid", "violet", "tulip"} ;
        for (String flower: str){
            System.out.println(str[0]);//this will print first element "rose" for 5 times
             System.out.println(flower);
        }


    }
}
