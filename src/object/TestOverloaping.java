package object;

public class TestOverloaping {
    public static void main(String[] args) {
        overLoadPractice obj= new overLoadPractice();
        obj.sum("String example ", 4,5);
        obj.sum(new int[]{1,2,3});
        obj.sum(5,13);
        Cat cat1= new Cat();
        cat1.run();
        cat1.run("in bed");
        MethodPractice obj2= new MethodPractice();
        obj2.ageCaulculator("Alina", 1994);
        obj2.ageCalculator(1990);




    }
}
