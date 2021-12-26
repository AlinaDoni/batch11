package array;

import java.util.Arrays;
import java.util.Locale;

public class ForEachPractice3 {
    public static void main(String[] args) {
        String[] names= {"John","Alina", "Daniel", "Nina", "Lili"};
        String[] yahoo= new String[names.length];
        String[] gmail= new String[names.length];
        //create email adress for each of the names in the array
        //john@gmail.com
        //store these e-mail in an array
        // if is gmail e-mail, store it in gmail email
        //if it is yahoo e-mail, store in yahoo array
        for (String email : names) {
            System.out.println(email + "@gmail.com");
            System.out.println(email.toUpperCase().concat("@yahoo.com"));
        }
        System.out.println("***************");
        for (int i=0 ; i< names.length; i++){
//            String ggmail= names[i]+"@gmail.com";
//            String ymail= names[i].toUpperCase().concat("@yahoo.com");

            gmail[i]= names[i]+ "@gmail.com";
            yahoo[i]= names[i] + "@yahoo.com";
            }
        System.out.println(Arrays.toString(gmail));
        System.out.println(Arrays.toString(yahoo));

        }

    }

