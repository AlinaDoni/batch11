package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {

        //modulus--> % leftovers after dividion

        int number1 = 45;
        int number2 = 6;
        int result1 = number1 %number2;
        System.out.println(result1);
// Find the sum of digits from given number
        //123 --->1+2+3=6   ===>sout(sum is   SUM
        //12 % 10 = 2

        //123 % 10 = 3
        // 1  % 10 =1

        int muNumber = 123;
        int num1= muNumber % 10;
        muNumber = muNumber/10;
        int num2 = muNumber % 10;
        muNumber=muNumber/10;
        int num3 = muNumber%10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        double sum = num1+num2+num3;
        System.out.println(sum);

    }


}
