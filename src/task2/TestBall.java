package task2;

public class TestBall {
    public static void main(String[] args){
        Ball b1=new Ball("red",3);
        Ball b2=new Ball("green",6);
        Ball b3=new Ball("yellow");
        b3.setR(9);
        System.out.print(b1);
        System.out.print("\n");
        b1.intoMetres();
        b2.intoMetres();
        b3.intoMetres();
        var x=new TestDog(3);
        x.printer();
    }
}
