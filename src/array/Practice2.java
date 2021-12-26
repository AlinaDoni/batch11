package array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] numbers ={4,3,5,6,7,11,45};
        System.out.println(numbers[3]);//6
        numbers[6] =66;
        System.out.println(numbers[6]);
        System.out.println(numbers.length);//7
        System.out.println(Arrays.toString(numbers));
        for(int m=0; m< numbers.length; m++)
            System.out.println(numbers[m]);



    }
}
