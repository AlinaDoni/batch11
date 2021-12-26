package array;

public class Task7 {
    public static void main(String[] args) {
        String[][] devices= {{"Apple", "Lenovo","HP","DELL","Acer"},{"Samsung","LG","Sony"},{"Alexa","Google","Logitec","JBL"}};

        double[][] prices={{2500, 1600, 1800, 1900, 1100},{2199, 1799, 1599},{79.99, 89.99, 64.99, 55.99}};

        for(int i=0 ; i< devices.length; i++){
            for (int j=0; j< devices[i].length; j++){
                System.out.println(devices[i][j]+ " is $"+ prices[i][j]);
                if (prices[i][j]> 1000){
                    break;
                   // System.out.println("this device "+ devices[i][j] + " is less that 1000$> "+ prices[i][j]);
                }
            }

                }
            }
        }



