package task6;

public class Test {
    public static void main(String[] args) {
        var C=new Car("Lexus",10000000);
        var P=new Phone("Honor",25000);
        var T=new TV("Samsung",100000);
        System.out.println(C.getName()+" "+C.getPrice());
        System.out.println(P.getName()+" "+P.getPrice());
        System.out.print(T.getName()+" "+T.getPrice());
    }
}
