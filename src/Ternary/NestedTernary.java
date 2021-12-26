package Ternary;

public class NestedTernary {
    public static void main(String[] args) {

        int num1= 4, num2=5;
        //for a ternary we need: condition?   option1:   option2;
    String r1= ++num1 > num2? num1<num1 ? "Java" : "Selenium" : "Nested";
        System.out.println(r1);//nested
        String r2= ++num1 >= num2? num1<num1 ? "Java" : "Selenium" : "Nested";
        System.out.println(r2);
        String r3= +num1< 1? num1<num1 ? "Java" : "Selenium" : num1<1? "Summer" : "Winter";
        System.out.println(r3);//winter

        System.out.println(1 > 1? "David" : 1>2? "Nested first side ": 3==4 ? "second side of first" :
                "second side of second");//second side of second
        System.out.println(1 == 1? "David" : 1>2? "Nested first side ": 3==4 ? "second side of first" :
                "second side of second");// David
     }
}
