package loops.forLoop;

public class MonthsOfYears {
    public static void main(String[] args) {
        /* print out months and year
        2020...2023
         */
        for (int year=2020; year<=2023; year++){
            System.out.println(year);
            for (int m=1 ; m<=12;  m++){
                System.out.print( m + " ");
                switch (m){
                    case 1:
                        System.out.println("Jan");
                        for (int d=1; d<=31; d++){
                            System.out.print(d+ " ");
                        }
                        break;
                    case 2 :
                        System.out.println("Feb");
                        break;
                    case 3 :
                        System.out.println("March");
                        break;
                    case 4 :
                        System.out.println("April");
                        break;
                    case 5 :
                        System.out.println("May");
                        break;
                    case 6 :
                        System.out.println("June");
                        break;
                    case 7 :
                        System.out.println("July");
                        break;
                    case 8 :
                        System.out.println("August");
                        break;
                    case 9 :
                        System.out.println("September");
                        break;
                    case 10 :
                        System.out.println("October");
                        break;
                    case 11 :
                        System.out.println("November");
                        break;
                    case 12 :
                        System.out.println("December");
                        break;

                }
            }
            System.out.println();

        }

    }
}
