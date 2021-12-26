package array;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        String[] colors={"white", "black", "red", "pink","orange"};
        //print out every element in reverse order from the given array

        String reverse="";
        String[] reversed= new String[colors.length];
        for (int a=0; a < colors.length; a++){
           reverse="";
           for (int index=colors[a].length()-1; index>=0; index--){
              reverse+=colors[a].charAt(index);

           }
           reversed[a] = reverse;

        }
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(reversed));
    }
}
