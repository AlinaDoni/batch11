package ifStatement;

public class elsePractice {
    public static void main(String[] args) {
        boolean myLicense= true;
        if (myLicense== true){
            System.out.println("You can enjoy your driving");
        } else {
            System.out.println("DMV is next door");

        }
        int number = 1234;
        if (number<24){
            System.out.println("Yaaaaayyyyy");
        }else{
            System.out.println("This is print out from else block");
        }
        //=============
        if ('A' == 'a')
            System.out.println("***********");//if there are no curly brakets will stil print the first line

        else
            System.out.println("!!!!!!!!!!");// if there are no curly brakets and the statement is false will print this statement
    }
}
