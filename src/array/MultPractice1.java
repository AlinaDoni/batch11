package array;

public class MultPractice1 {
    public static void main(String[] args) {
        //states of USA from different regions
        //print out every state one by one
        String[][] states = {{"IL", "OH"}, {"NY", "FL", "NC"}, {"CA", "WA", "OR", "UT"}};
        for (String[] state : states) {
            for (String eachState : state) {
                System.out.println(eachState);


            }
        }
    }
}
