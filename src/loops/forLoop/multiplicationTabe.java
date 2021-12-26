package loops.forLoop;

public class multiplicationTabe {
    public static void main(String[] args) {

        for (int mult=1; mult<=5 ; mult++){
            for (int n=1 ; n<=10 ; n++){
                System.out.println(mult + " * " + n + " = " +(mult*n));
            }
        }
    }
}
