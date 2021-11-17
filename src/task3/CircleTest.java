package task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle pt=new Circle();
        pt.set_r(4);
        pt.set_x(8);
        pt.set_y(9);
        System.out.print(pt.get_r());
        System.out.print('\n');
        System.out.print(pt.get_x());
        System.out.print('\n');
        System.out.print(pt.get_y());
        System.out.print('\n');
        Human h=new Human();
        System.out.println(h.h.getColor());
        System.out.println(h.l.getLenth());
        System.out.println(h.ha.getLenth());
    }
}

