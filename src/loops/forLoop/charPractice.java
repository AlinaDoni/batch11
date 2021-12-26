package loops.forLoop;

public class charPractice {
    public static void main(String[] args) {
        //print out lower case alphabet
        for (char ch='a'; ch<='z' ; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
        //print letters from h to t
        for ( char ch= 'h' ; ch<='t'   ; ch++ ) {
            System.out.print(ch+ " ");
        }
        System.out.println();
        //print letters from z to a
        for (char ch= 'z'; ch>= 'a' ; ch--){
            System.out.print(ch + " ");

        }
    }
}
