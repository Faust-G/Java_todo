package task5;

public abstract class Dish {
    private String mark;
    private String color;
    private int age;

    public Dish(String color,  int age) {
        this.color=color;
        this.age=age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void show();
}

