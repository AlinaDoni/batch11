package primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1 = 12;
        short sh1 = b1; // byte is smaller than short and we can store in the largest one

        short sh2 = 3;
      //  byte b2 = sh2; compile time error; you can not store larger data type into the smaller data type

        int result= b1 + sh2;
        byte b2 = 2;

        //byte result2=b1 + b2; compile time error
        int result2 =b1 +b2; // numeric promotion happens and java promote smaller data type to int


        int i1= 4;
        double d1= i1;
        //int i2 = d1; you can not store double value in int data type compile time error

        float f1 = 1.2f;
        float f2 = 3.4f;

        float result3= f1+f2;

        double d3= result3;
        //float f3= d3; compile time error

        double d4= 1.2;
      // float result4= f1 + d4; compile time error
        double result4= f1 + d4;









    }
}
