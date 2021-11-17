package task2;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Dog(String name){
        this.name=name;
        age=0;
    }
    public Dog(){
        name="green";
        age=5;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public String toString(){
        return "name = "+name+", age = "+age;
    }
    public int toHuman(){
        return age*7;
    }
    public void intoMetres(){
        System.out.print(name+", "+toHuman() + "\n");
    }
}
