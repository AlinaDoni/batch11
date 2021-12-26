package loops.forLoop;

public class PalindromePractice {
    public static void main(String[] args) {
        //efe, 1234321-palindrome, civic, ana,

        String str= "efe";
        String str1= "";
        for (int ind=str.length()-1 ; ind>= 0; ind--){

            str1 +=str.charAt(ind);
        }
        if (str.equals(str1)){
            System.out.println("Your word is a palindrom word");
        }else {
            System.out.println("Your word is not a palindrom word");
        }
        // find out if the given number is a palindrome number
        String n= "1234321";
        int number= 1234321;
        String str2="" + number;








    }

}
