package primitives;

public class TruthTable1 {
    public static void main(String[] args) {
        //visa and ticker
        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;
      boolean canTravel = visa == myVisa && ticket == myTicket;
        System.out.println(canTravel);// false

        // ask question
        boolean online = true;
        boolean campus = true;

        boolean student = false;
        boolean askQuestion=  student == online || student == campus;
        System.out.println("can I ask question? " + askQuestion);// false


        boolean student1 = true;
        boolean askQuestion1=  student1 == online || student1 == campus;
        System.out.println("can I ask question? " + askQuestion1);// true

        //to pass the class
        //90% or more attendance and score of 80% or more to pass
        int reqAttendance = 90;
        int reqScore = 80;

        int yourAttendance= 100;
        int yourScore = 80;

       boolean pass=  yourAttendance >= reqAttendance && yourScore >= reqScore;
        System.out.println("can I pass the course? "+ pass);//true






    }
}
