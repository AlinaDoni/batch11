package array;

import java.util.Arrays;

public class MultPractice {

    public static void main(String[] args) {

        int[][] numbers=new int[2][3];
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        numbers[0][0]= 45;
        numbers[0][1]= 21;
        numbers[0][2]= 37;
        numbers[1][0]=22;
        numbers[1][1]=38;
        numbers[1][2]=26;
        System.out.println(numbers[1][2]);//26
       // numbers[0][3]=88;//ArrayIndex out ofBoundException
        //System.out.println(numbers[0][3]);//exception
        System.out.println(Arrays.deepToString(numbers));// out come [[45, 21, 37], [22, 38, 26]]
        for (int i=0;i< numbers.length; i++){
            System.out.println(Arrays.toString(numbers[i]));

            for (int k = 0; k < numbers[i].length; k++){
                System.out.println(numbers[i][k]);
            }
        }

        System.out.println("===================");
        for (int[] nums : numbers){
            for (int num : nums){
                System.out.println(num);
            }
        }


    }
}
