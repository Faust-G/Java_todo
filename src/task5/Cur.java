package task5;

public final class Cur extends Dog {
    private String name;
    @Override
    public void show() {
        System.out.println(name+' '+"gav gav!");
    }
    public Cur(String color, int age, String name){
        super(color,age);
        this.name=name;
    }
}
