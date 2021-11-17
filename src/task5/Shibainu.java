package task5;

public final class Shibainu extends Dog {
    private String name;
    @Override
    public void show() {
        System.out.println(name+' '+"brgav!");
    }
    public Shibainu(String color, int age, String name){
        super(color,age);
        this.name=name;
    }
}
