package object;

public class TestStatic {
    public static void main(String[] args) {
        //you can call static method from another class by using name of the class
       StaticPet.eat();
       StaticPet pet= new StaticPet();
       pet.eat();
       pet.play();
        System.out.println(pet.food);
        pet.play();

    }
}
