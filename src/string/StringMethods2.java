package string;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        String flower = "Rose";
      int indexOfR= flower.indexOf('R');
      int indexOfR1 = flower.indexOf("R");
        System.out.println("first implementation "+ indexOfR);
        System.out.println("second implementation "+ indexOfR1);

        System.out.println(flower.indexOf('o'));
        System.out.println(flower.indexOf("os"));//1
        System.out.println(flower.indexOf("oe"));//-1 if it does not find matching char/char sequence it will return -1
        System.out.println(flower.indexOf("r"));//-1 --> there is not lower case r
        System.out.println(flower.indexOf("Rose"));//0
        System.out.println(flower.indexOf("rose"));//-1
        System.out.println(flower.indexOf("Roses"));//-1 --> there is no matching char

        String object = "umbrellam";
      System.out.println(object.indexOf("e", 6));
        System.out.println(object.indexOf('l'));//5
        System.out.println(object.indexOf('l',6));
        System.out.println(object.indexOf('m',object.indexOf('m')+1));
        System.out.println(object.length());
        System.out.println(object.indexOf('r'));
        String sentence = "I love lillies";
        System.out.println(sentence.indexOf('l',sentence.indexOf('i')));

        //toUppercase() --?makes you string as uppercase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        //toLowerCase() --> makes string to lower case
        System.out.println(sentence.toLowerCase());

        //think about making single letter upper case
      String str = "Just do it";
      char letter = str.charAt(str.indexOf("d"));
      String str2= "";
      str2 += letter;
      System.out.println(str2.toUpperCase());


    }
}
