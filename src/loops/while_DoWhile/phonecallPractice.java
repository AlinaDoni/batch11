package loops.while_DoWhile;

public class phonecallPractice {
    public static void main(String[] args) {
//        -you $40 in your international phone calling account
//                -if every call you make costs $5
//        -find out and print: how many total calls you can make with your balance of $40
//        ex. print out --> "you can make <...> calls with your balance"
        int balance= 40;
        int callCost=5;
        int count=0;
        while( balance > 0){

            balance-=callCost;
            ++count;

           // System.out.println("After"+ count+ " call"+  " your remaining balance is "+ balance);

            int remainCalls= balance/callCost;
            System.out.println("you can make"+ remainCalls+ " more calls with your remaining balance");

        }
        System.out.println("you can make "+ count + " phone calls with your balance");

    }

}

