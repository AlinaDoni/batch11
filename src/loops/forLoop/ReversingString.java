package loops.forLoop;

public class ReversingString {
    public static void main(String[] args) {
        //reverse the string
        String str= " Lets go home";
        String str1="";
        char ch;
        for(int ind= str.length()-1; ind>=0; ind-- ){
            str1+=str.charAt(ind);
        }
        System.out.println(str + "  Reverse is >>   " + str1);



    }
}
