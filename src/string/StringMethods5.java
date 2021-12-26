package string;

public class StringMethods5 {
    public static void main(String[] args) {
        String word = "Sunday";
        // replace()

       String updatedWord=  word.replace('a', '$');
        System.out.println(updatedWord);

       String newWord= word.replace("Sun", "Satur");
        System.out.println(newWord);
        System.out.println(word.replace("day","old"));

        String code= "java";
        System.out.println(code.replace('a','%'));
    }
}
