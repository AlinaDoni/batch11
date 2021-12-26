package ifStatement;

public class IfCurlyBracketPractice {

    public static void main(String[] args) {
        int number = 123;
        if (number== 1234)
            System.out.println("Number is equals to 1234");
        System.out.println("Number is not equals to 1234");// the statement is true and will print both lines

        if( number == 5) // the condition is false , and is going to skip the next line
            System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("hello Selenium");
        System.out.println("Hello Alex");
        System.out.println("Hello All");
        int num1= 6;
        if (num1 <10)
            num1++;
        System.out.println(num1);// it trin out 7
        int num2 = 4;
        if (num2 >20)
            num2++;
        System.out.println(num2);// it print 4 because the condition is false and will skip the next line

        if (num2>20){
            num2++;
            System.out.println("I am in the curly ==>"+num2);}// will not print because the statement is false

    }
}
