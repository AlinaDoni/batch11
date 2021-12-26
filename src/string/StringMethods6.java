package string;

public class StringMethods6 {
    public static void main(String[] args) {
        String name = "        Techtorial Academy is located in Des Plaines        ";
        //trim()-- it will remove spaces before and after the string
        String updatedName= name.trim();
        System.out.println(updatedName);
        System.out.println(name);

        //subString()

         String part1= updatedName.substring(4);
        System.out.println(part1);
        String part2= updatedName.substring(4,12);// the char of first index is included  and the second is not included
        System.out.println(part2);

    }

}
