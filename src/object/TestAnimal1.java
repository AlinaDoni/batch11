package object;

public class TestAnimal1 {
    public static void main(String[] args) {

        animal dog= new animal();
        dog.info();

        animal bird = new animal();
       bird.name = "Woody";
       bird.age = 30;
       bird.bread = "Husky";
       bird.energy = 70;
       bird.run();
       bird.info();



    }
}
