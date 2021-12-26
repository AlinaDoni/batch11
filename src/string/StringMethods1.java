package string;

public class StringMethods1 {
    public static void main(String[] args) {
        String device = "microphone";

     device.concat(" is an input device");
        System.out.println(device);

        char ch = device.charAt(1);
        System.out.println(ch);

        int letterCount= device.length();//return a number
        System.out.println(letterCount);
        device += "is expensive";
        System.out.println(device.length());
        device.concat("device");
        System.out.println(device.length());
        device=device.concat("device");
        System.out.println(device.length());
        //take last char from this last version of the string

        System.out.println(device.charAt(27));

        String example = "A unified architecture made up of a collection of interfaces designed to improve the storage and process of application data";
           char lastChar= example.charAt(example.length()-1);
        System.out.println(lastChar);

        String example2 = "Thanksgiving is over. The of the turkey will go down.So can you can find " +
                           "more inexpensive purchases";
       int count= example2.length();
        char  lastLetter = example2.charAt(count-1);
        System.out.println(lastLetter);
        //find the middle char from last string
        char middleLetter= example2.charAt(example2.length()/2);

        System.out.println(middleLetter);
        String school= "Techtorial";
        //find the miidle char from last string
        System.out.println(school.charAt((school.length()-1)/2));
        System.out.println(school.charAt(15));//string index out of range : 15




    }
}
