package loops.forLoop;

public class practice3 {
    public static void main(String[] args) {
        //print out every letter from the string by using for loop
        //print out index number os the letter and * toghether with the letter

        String str= "Today is Snowyinnng";

int n=0;

        for( int index=0; index< str.length(); index++){
            System.out.println( index+ "*"+str.charAt(index));
        }

        //print out only letter "y" from the string
        for (int index1=0; index1<str.length(); index1++){
            if (str.charAt(index1) == 'y') {
                System.out.println(index1 + "*"+ str.charAt(index1));
            }

        }
        //count the number of ltter 'n' in the given string
        for (int i=0; i<str.length() ; i++) {
            if (str.charAt(i) == 'n') {
                n++;
            }
        }
        System.out.println("There are " + n + " letter n in the string");

    }
}
