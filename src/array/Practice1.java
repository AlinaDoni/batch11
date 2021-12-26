package array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {


        int[] studentIds = new int[5];
        studentIds[0] = 21;
        studentIds[1] = 31;
        studentIds[2] = 41;
//        studentIds[3] = 51;
//        studentIds[4] = 61;
        System.out.println(studentIds[1]);
        System.out.println(studentIds[0]);
        System.out.println(studentIds[3]); //0
        studentIds[1] = 99;
        System.out.println(studentIds[1]);
        //studentIds[5] = 51;// index 5 out of bounds for length 5
       // System.out.println(studentIds[5]);// out of bunds
        System.out.println("============");
        for (int i =0; i< studentIds.length; i++ ){
            System.out.println(studentIds[i]);
        }
        System.out.println("*********");
        System.out.println(Arrays.toString(studentIds));//  [21, 99, 41, 0, 0] it will print out all elements as array from array
        System.out.println(studentIds);//has code- memory loacation of the array




    }


}
