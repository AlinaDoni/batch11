package primitives;

public class BooleanPractice {

    public static void main(String[] argus){
            boolean isHungry = true;
            System.out.println(isHungry);
            boolean isLightOn = false;
            System.out.println(isLightOn);
            System.out.println(true);
            System.out.println(isHungry == isLightOn); // == means comparing
            isLightOn =isHungry;
            isLightOn= false;
            System.out.println("Last version for isHungry >>"+isHungry);//true
            System.out.println("Last for Is Light>> "+isLightOn);//


        }


    }