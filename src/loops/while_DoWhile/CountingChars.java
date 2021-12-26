package loops.while_DoWhile;

public class CountingChars {
    public static void main(String[] args) {
        /*led
  -count letters, digits and other characters in the String
  String str = "$3%GTlk64mn^y?";
  sout("There are <..> letters in the string");
  sout("There are <..> digits in the string");
         */
        String str = "$3%GTlk64mn^y?".toUpperCase();
        int strLenght=str.length();
        int ch= 0, totLetter=0, totNum=0, totChar=0;


         do {
             if (str.charAt(ch)>='A'&& str.charAt(ch)<='Z'){
                 totLetter++;
             } else if (str.charAt(ch)>= '0' && str.charAt(ch)<='9'){
                 totNum++;
             } else{
                 totChar++;
             }
             ch++;
        }while(ch < strLenght);
        System.out.println("There are "+ totLetter+ " letters in the string");
        System.out.println("There are "+ totNum+ " numbers in the string");
        System.out.println("There are "+ totChar + " simbols in the string");




    }
}
