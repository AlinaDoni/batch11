package ifStatement;

public class IfPractice {
    public static void main(String[] args) {
        int appleNumber = 5;
        int orangeNumber = 10;
        // ==, >, <, !=, <=, >=

        System.out.println("I am about to create an IF Block");
        if(appleNumber == orangeNumber){// this statement is false , java skip this block
            System.out.println("I am so lucky today! ");
        }
        if(appleNumber != orangeNumber){// this statements is true and it will print  the text

            System.out.println("I am so Happy today");
        }
        if (appleNumber <= orangeNumber){
            int sum = appleNumber + orangeNumber;
            System.out.println(" You have "+ sum + " fruits");

        }
    }
}
