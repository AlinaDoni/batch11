package object;

public class Cat {

    String name;
    int age;
    String color;
    int foodAmount;
    //create a method names as run(), it will take a parameter as destination,
    //it will reduce food amount by 1 every execution
    //it will print out as "Cat is running...west"

    public void run(String destination){
        foodAmount-=1;
        System.out.println(name+ " is running to "+ destination);
    }
    public void run(){
        System.out.println("Cat is running");
    }
    //==========================
    //create a method named as setColor(), it will take a parameter and initialize the color of the cat

    public void setColor(String something){
        color= something;
    }
    //================
    //create a method that will return color of cat, name it as getColor()

    public String getColor(){
        return color;
    }

    public static void main(String[] args) {
        Cat cat1= new Cat();
        cat1.name= "Lola";
        cat1.color="white";
        cat1.age= 1;
        cat1.foodAmount=12;
        cat1.run("kitchen");
        System.out.println(cat1.foodAmount);
        cat1.setColor("orange");
        System.out.println(cat1.color);
        cat1.getColor();
        System.out.println(" this is coming from get color method==> "+ cat1.getColor());

    }

}
