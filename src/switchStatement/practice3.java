package switchStatement;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        /*
        ask user for name of geometrical shape
        based on the name of the shape
        calculate the are of that shape
        get length and  width and height of those shapes from user to use them in calculation
        print out name of the shape and area of that shape
        - triangle, rectangle
         */
        Scanner input= new Scanner(System.in);

        System.out.println("Which shape you want to calculate are of? triangle/rectangle ");
        String shape= input.next().toLowerCase();
        switch (shape){
            case "triangle" :
                System.out.println("Please enter height of the triangle");
                double h = input.nextDouble();
                System.out.println("Please enter the base of triangle");
                double b = input.nextDouble();
                System.out.println("The area of the triangle is "+ ((b*h)/2));
                break;
            case "rectangle" :
                System.out.println("Please enter lenght of rectangle ");
                double l= input.nextDouble();
                System.out.println("Please enter width of rectangle");
                double w= input.nextDouble();
                System.out.println("The are of the rectangle is " + (l*w));
                break;

            default:
                System.out.println("your shape calculation is not an option for us");
        }


        }

    }

