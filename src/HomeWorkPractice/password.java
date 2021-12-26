package HomeWorkPractice;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password");
        String p = input.nextLine();
        /*
        Ask user to enter a password

1 - > If the string doesn't have any upper case letter or any lower case letter print "Your password is not acceptable"

2 - > If the first character of the password is upper case letter and last character of the password is not letter print "Your password is strong".

3 - > If first character of the password is lower case letter and last character of the string is upper case print "Your password should be improved"

4 - > For all other conditions print "Your password is not valid"
         */
        char lastLetter = p.charAt(p.length() - 1);
        char firstL = p.charAt(0);

        if (!p.matches(".*[A-Z].*") || !p.matches(".*[a-z].*")) {
            System.out.println("Your password is not acceptable");
        } else if (firstL >= 'a' && firstL <= 'z' || firstL >= 'A' && firstL <= 'Z') {
            System.out.println("does not contains upper case letter");
        }

    }
}

