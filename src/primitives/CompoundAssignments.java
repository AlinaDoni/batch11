package primitives;

public class CompoundAssignments {
    public static void main(String[] args) {
        // +=    -=   /=   *=   %=
        int num1= 7;
        int num2= num1 + 7;
        num1 += num2;
        System.out.println(num1);

        num2 -=8; // num2 = num2 - 8;
        System.out.println(num2);

        int num3 = num1 + num2;
        num2+=num3;
        num1+=num3;
        System.out.println(num3);
        System.out.println(num1);
    }
}
