package switchStatement;

public class SwitchPractice {
    public static void main(String[] args) {
        int number=1200;
        System.out.println("before switch");

        switch(number){
            case 100:
                System.out.println("This is first case");
                break;
            case 110:
                System.out.println("This is second case");
                break;
            case 120:
                System.out.println("Thi is third case");
                break;
            case 123:
                System.out.println("This is fourth case");
                break;
            case 130:
                System.out.println("This is fifth case");
                break;
            case 101:
                System.out.println("This is first case");
                break;
//            default:
//                System.out.println("This is default case");

        }
        System.out.println("after switch");
    }
}
