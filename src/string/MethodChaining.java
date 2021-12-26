package string;

public class MethodChaining {
    public static void main(String[] args) {
        String name = "         David       ";
       char  n= name.substring(5).substring(2).toUpperCase().replace("A", "xxxx").
                trim().charAt(1);
        System.out.println(n);
        String word=name.substring(5).substring(2).toUpperCase().replace("A", "xxxx").
                trim();
        System.out.println(word);



    }
}
