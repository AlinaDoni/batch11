package Ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int a=3, b=5, k=7;

        //increments++ / decrements--
      int r1=  a >= k ? a+k++ : ++b + k;
        System.out.println(r1);// print out 13
        System.out.println(b);//6
        System.out.println(k);//7
        int r2= k< ++b ? 2 * ++k - 2 : --k * 2 -1;

        System.out.println(r2);//11
        System.out.println(k>=b ? "I got this" : false);
        System.out.println("test".equals("test")? "TEST".toLowerCase() : 99);//test

    }
}
