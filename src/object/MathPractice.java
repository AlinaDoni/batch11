package object;

import java.util.Locale;

public class MathPractice {
    public void sum (){
        int a = 11;
        int b = 22;
        int sum = a + b;
        System.out.println( a + " + "+ b  + " = "+sum);

    }

    public void total(int number1, int number2){
        int total = number1+number2;
        System.out.println( number1 + " + "+ number2  + " = "+ total);

    }
    public int sum2(int n1, int n2){
        int result= n1 + n2;
        //System.out.println( n1 + " + "+ n2  + " = "+ result);
        return result;

    }

    public String speak(){
        String string="test";
        string=string.toUpperCase();
        int i= 23;
        i++;

        return i+ " this is example of String result type "+ string;

    }
    public String numberToString(double d){

        return ""+d;
    }
}
