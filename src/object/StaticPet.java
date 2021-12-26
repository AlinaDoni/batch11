package object;

public class StaticPet {
    String name;
    int age;
    String color;
   static  double food=20;

     static public  void eat(){

        food-=1;
        System.out.println("food amound is now "+ food);
        StaticPet pet9=new StaticPet();
        //pet9.play();
         pet9.color="red";
        //to call non-static method into static method,
         //you need to create object
    }
    public void play(){
        System.out.println("Pet is playing");
        eat();
        StaticPet.eat();
        food=100;
        color="Blue";
    }

    public static void main(String[] args) {
        StaticPet pet1= new StaticPet();
        pet1.eat();
        pet1.eat();
        StaticPet pet2= new StaticPet();
        pet2.eat();
        pet1.eat();
        pet2.eat();
        //===========
        eat();
        StaticPet.eat();
        //StaticPet.play();
        // non-static methods can not be called without
        //object from a static method

    }
}
