package primitives;

public class Farm {
    public static void main(String[] args) {
    /*
    in a farm there are 12 cows and 23 chickens
    find the total legs of the animals in the farm and print out
    if each cow $2345 and each chikens cost 23.99
    find the total worth of these animal and print it
     */
        int cow = 12 ;
        int chic =23;
        int legResult = cow *4 + chic *2;
        System.out.println(legResult);
        double priceC = cow* 2345;
        double priceCH = chic * 23.99;
        double totalPrice = priceC + priceCH;
        System.out.println(totalPrice);





    }


}

