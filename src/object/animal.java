package object;

public class animal {
    //instance variables
    String name; //declare variable
    int age;
    String color;
    String bread= "Boxer";
    int energy=100;

    public void sleep(){
        energy=100;
        System.out.println(name +" is sleeping");
        System.out.println(name + " is charging up, his energy will be 100");

    }
    public void eat(){
        System.out.println(name + " is eating, please stay away");
    }
    public void run(){
        energy-=10;
        System.out.println(name + " your left energy is "+ energy);
    }
    public void info(){
        System.out.println("Name is "+ name + " Age is "+ age + " Color "+ color + " Bread is "+ color+ " energy is "+ energy);
    }


    }

