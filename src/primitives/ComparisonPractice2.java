package primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {


        // there is an event for kids if a child's height is 48" or more they can attend this even
        // print out the result if the kid can attend or not

        double reqHeight = 48;
        double kidHeight = 50;
        boolean attend = reqHeight >= kidHeight;
        System.out.println("Can this child attend the event? " + attend);

    }
}