package switchStatement;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class switchNested {
    public static void main(String[] args) {
        /*
       1 it department
          - David
          - Tima
       2 admin
           - Alex
           - Jessi
       3 customer care
         - Zack, Ana, John
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to techtorial? Choose one of the following : 1.it department/2.admin/ 3.customer care");
        int dept = input.nextInt();
        switch (dept){
            case 1:
                System.out.println("You are in it who do you want to speak David/Tim");
                input = new Scanner(System.in);
                String name = input.nextLine().toUpperCase();
                switch (name) {
                case "DAVID" :
                    // want to differ morning and afternoon hours
                    int hour = LocalDateTime.now().getHour()+10;
                    System.out.println(hour);
                    if (hour > 8 && hour < 12){
                        System.out.println("Im'm not in the office");
                    } else if (hour>12 && hour <17) {
                    System.out.println("You have David on the phone");}
                    else {
                        System.out.println("are you crazy to call so late");
                    }
                    break;
                case "TIM":
                    System.out.println("You have Tima on the phone");
                    break;
                    default:
                        System.out.println("We don't have " + name);
                        break;
                } break;
            case 2:  System.out.println("You are in admin who do you want to speak Alex/Jessi");
            input = new Scanner(System.in);
        String name1 = input.nextLine().toUpperCase();
        switch (name1) {
            case "ALEX" :
                System.out.println("You have Alex on the phone");
                break;
            case "JESSI":
                System.out.println("You have Jessi on the phone");
                break;
            default:
                System.out.println("We don't have " + name1);
                break;
            } break;
            case 3:  System.out.println("You are in customer care who do you want to speak Zack/Ana/John");
            input = new Scanner(System.in);
                String name2 = input.nextLine().toUpperCase();
                switch (name2) {
                    case "ZACK" :
                        System.out.println("You have ZACK on the phone");
                        break;
                    case "ANA":
                        System.out.println("You have ANA on the phone");
                        break;
                    case "JOHN":
                        System.out.println("You have JOHN on the phone");
                        break;
                    default:
                        System.out.println("We don't have " + name2);
                        break;
                } break;

            }
            }

        }



