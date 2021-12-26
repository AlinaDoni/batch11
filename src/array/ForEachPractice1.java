package array;

public class ForEachPractice1 {
    public static void main(String[] args) {

        double[] checks = {2540, 1000, 10000, 65.50 , 1.99};
        //by using for each loop, find and print out the total amount of checks
        double sum=0;
        for (double amount : checks){
            sum+=amount;

        }
        System.out.println(sum);


    }
}
