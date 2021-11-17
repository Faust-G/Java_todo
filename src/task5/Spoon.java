package task5;

public class Spoon extends Dish{

    public Spoon(String color, int age) {
        super(color, age);
    }

    @Override
    public void show() {
        System.out.println("this is spoon");
    }
}
