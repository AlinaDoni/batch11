package loops.forLoop;

public class DigitalClock {
    public static void main(String[] args) {


        //print ours and minutes for 12 hoursof a day
        // ex: 0:0
        label:

        for (int hour=0 ; hour<12 ; hour++){
            inner:

            for (int min=0; min<=59; min++){

                if (min>=10 && min <=12){
                   continue ;
                }
                if (min >= 30) {
                break label;
                }

                for (int second=0; second<=59; second ++){

                    System.out.println(hour + " : "+ min+ " : "+ second);
                    if (second ==10)
                    break ;

                }
            }
        }

    }
}