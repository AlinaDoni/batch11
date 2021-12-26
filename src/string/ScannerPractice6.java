package string;

import java.util.Scanner;

public class ScannerPractice6 {
    public static void main(String[] args) {
//        create a new class: MoneyTransaction
//        David wants to deposit hispaychecks into his account and already has $200
//        He has 3 paychecks (610, 385, 975)
//        he can only deposit one check at a time
//                *Ask: "How much is Deposit amount?" every time he is making deposit
//        after all of paycheks deposited in to account
//        he bought a phone for $599 and headphone for $299
//                *Ask: How much is phone?
//	*Ask: How much is headPhone?
//        Calculate his final money and print --> "Your final balance is <finalAmount>"
        double balance = 200;//his initial amount in the account
        Scanner input = new Scanner(System.in);
        System.out.println("How much is Deposit amount?");
        double check1= input.nextDouble();
        balance +=check1;
        System.out.println("How much is Deposit amount?");
        double check2=input.nextDouble();
        balance +=check2;
        System.out.println("How much is Deposit amount?");
        double check3 = input.nextDouble();
        balance +=check3;
        System.out.println("How much is the phone?");
        double phone = input.nextDouble();
        balance -= phone;
        System.out.println("Houw much is the headPhone");
        double headPhone = input.nextDouble();
        balance -= headPhone;
        //double finalAmount = (check1+check2+check3+balance)-phone-headPhone;
        System.out.println("Your final balance is "+balance);


    }
}
