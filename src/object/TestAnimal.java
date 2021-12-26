package object;

import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {

       animal cat= new animal();
        System.out.println(cat.name);
       cat.name= "Leo";
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);
        cat.age = 9;
        cat.color= "white";
        System.out.println(cat.age);
        System.out.println(cat.color);
        //create a dog animal, try to use instanse variable with you new object

        animal dog= new animal();
        dog.name="Bim";
        dog.color="brown";
        dog.age= 12;
        System.out.println(dog.name);
        System.out.println(cat.name);
        System.out.println(dog.age);
        System.out.println(cat.age);
        System.out.println(dog.color);
        System.out.println(cat.color);
        System.out.println(dog.bread);
        System.out.println(cat.bread);
        cat.bread = "Scottish";
        System.out.println(cat.bread);

        cat.sleep();
        dog.sleep();
        cat.eat();
        dog.eat();
       cat.run();
       cat.run();
        System.out.println(cat.energy);
        System.out.println(dog.energy);
        cat.run();
        cat.run();
        cat.run();//energy 50
        //charge up the animal they sleep
        cat.sleep();
        System.out.println(cat.name+ " you charged up your energy now is "+cat.energy);// energy is 100
        dog.sleep();
     System.out.println();





    }
}
