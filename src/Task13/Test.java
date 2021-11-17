package Task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer>k=new ArrayList<>();
        k.add(1);
        k.add(2);
        k.add(3);
        k.remove(0);
        System.out.println(k);
        LinkedList<Integer> d=new LinkedList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.remove(0);
        System.out.println(d);
        Myarray f=new Myarray(3);
        f.add(1);
        f.add(2);
        f.add(3);
        f.remove(0);
        System.out.println(f);
    }
}
