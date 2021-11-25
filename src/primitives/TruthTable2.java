package primitives;

public class TruthTable2 {
    public static void main(String[] args) {
        // there is an event for kids
        // if the age of child is 6 or les OR if the height of child is 48" or less
        // the event is free for that child
        int reqAge = 6;
        double reqHeight = 48;

        int childAge = 5;
        double childHeight = 49;
        boolean freeEvent = childAge <= reqAge  || childHeight<= reqHeight;
        System.out.println("is the event free for the kid? " + freeEvent);
        //find out if student can pass a class
        //there are 3 test taken
        //average of those test has to be 70 or more
        // attendance rate of student has to be 80
        //print out if student can pass or not
        int test1= 70;
        int test2 = 75;
        int test3= 80;
        int testAverage = (test1 + test2 + test3) / 3;

        int reqAverage = 70;
        int reqAtendance = 80;
        int studentAtendance = 95;
        boolean canPass = testAverage >= reqAverage && studentAtendance>= reqAtendance;
        System.out.println("Will the student pass? " + canPass);




    }
}
