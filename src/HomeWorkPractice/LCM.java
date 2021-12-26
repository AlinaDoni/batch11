package HomeWorkPractice;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        System.out.println("Enter the number 1");
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        System.out.println("Enter the number 2");
        int num2=input.nextInt();
        int x,max=0,min =0, lcm=0;
        if(num1>num2){
            max=num1;
            min=num2;
        } else{
            max=num2;
            min=num1;
        }
        for(int i=1; i<=min; i++){
            x= max*i;
            if(x%min==0)  {
                lcm=x;
                break;

            }

        }
        System.out.println(lcm);
    }
}
