package array;

import java.util.Arrays;

public class BinaryPractice {
    public static void main(String[] args) {
        int[] numbers= {4,6,10,23,1,12};
        //Arrays.binarySearch(numbers,1);
        System.out.println(Arrays.binarySearch(numbers,1));// -1
        System.out.println(Arrays.binarySearch(numbers,23));//-7
        //first we have to sort the array
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,23));// 5
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,1));//0
        System.out.println(Arrays.binarySearch(numbers,50)); //-7 indicate possible position for this numbers
        System.out.println(Arrays.binarySearch(numbers,3));


    }
}
