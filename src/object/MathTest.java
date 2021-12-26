package object;

import sun.tools.jconsole.inspector.XObject;

public class MathTest {
    public static void main(String[] args) {
        MathPractice object = new MathPractice();
        object.sum();
        object.total(13, 35);
        object.total(276,765);
       // System.out.println(object.total(78,89)); you can not use method which has void return type in sout
       int a =object.sum2(3,1);
        System.out.println(a);
        int x= a*a;
        object.total(x,12);
        System.out.println(x);
        String str = object.speak();
        System.out.println(str);
        System.out.println(object.speak());
        String str3= object.numberToString(5.6);
        str3= str3.concat("Alina");
        System.out.println(object.numberToString(27.5).concat(" Alina Doni"));
        System.out.println(str3);


    }
}
