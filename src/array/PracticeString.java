package array;

import java.util.Arrays;

public class PracticeString {
    public static void main(String[] args) {

        String[] names= new String[6];
        System.out.println(Arrays.toString(names));//[null, null, null, null, null, null]
        names[5]= "Alina";
        names[4]= "Dinara";
        names[2]= "Ana";
        names[0]= "Mary";
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);//null
        //show all values from the names array one by one
        for (int i=0; i < names.length; i++){
            System.out.println(names[i]);

            //
        }


    }
}
