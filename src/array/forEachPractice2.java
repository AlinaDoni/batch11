package array;

public class forEachPractice2 {
    public static void main(String[] args) {
        char[] chs= {'A', '4', '&', 'z', '3', 'u', '*'};
        //by using for each loop, print out letter only
        for (char letter : chs){
            if (letter>='A'&& letter<='Z' || letter>='a' && letter<= 'z'){
                System.out.println(letter);
            }
        }
        //=================================================================================================
        System.out.println("=========");
        for (char element : chs){
            if (Character.isAlphabetic(element)){
                System.out.println("This is a letter "+ element);
            }else if (Character.isDigit(element)) {
                System.out.println("this is a digit "+ element);
            } else{
                System.out.println("this is some symbol "+ element);
            }
        }

        }
    }

