package loops.forLoop;

public class practice2 {
    public static void main(String[] args) {
        // print out numbers between 0 to 5 decreasing by using for loop

//        for (int b=5;  b>=0;  b-- ){
//            System.out.println(b);
//        }
      //find the sum of the numers 1 to 5 by using for loops
        //int sum=0;
        for (  int num=1, sum=0 ; num<5 ; num++){//when we create a variable in the pharantesis we can not print this variable outside the block
            sum+=num;
           System.out.println("Total>>"+ sum);
        } // System.out.println("Total>>"+ sum);
    }
}
