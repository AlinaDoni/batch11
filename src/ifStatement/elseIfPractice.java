package ifStatement;

public class elseIfPractice {
    public static void main(String[] args) {
        //pick a number between 0-25
        //    for each range of 0-5, 6-10, ... >> your number is in the range of 0 to 5 etc.
int num=-2;
if (num >=0 && num<=5){
    System.out.println("Your number is in range of 0 to 5");
}else if (num>=6 && num<=10){
    System.out.println("Your number is in range of 6 to 10");
}else if (num>=11 && num<=15){
    System.out.println("Your number is in the range of 11 to 15");
}else{
            System.out.println("your number is out of range");
        }


    }
}
