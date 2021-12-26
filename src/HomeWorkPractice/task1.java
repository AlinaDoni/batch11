package HomeWorkPractice;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Please do all coding here
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        String d = input.nextLine();
        int e = input.nextInt();
        String g = " F ";

        boolean nameStart= a.startsWith("A");
        boolean nameEnd= a.endsWith("V");
        boolean stateStart = b.startsWith("I");
        boolean stateEnds= b.endsWith("L");
        boolean city = c.length() <= 10;
        boolean age = e > 18;
        boolean gender = d.contains("F");
        boolean willVote = nameStart == nameEnd == stateStart == stateEnds == city == gender == age ;

        System.out.println(willVote);

        }
    }

