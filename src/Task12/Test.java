package Task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> s=new  ArrayList<>();
        s.add(new Student("Jane",4));
        s.add(new Student("Alice",3));
        s.add(new Student("Franc",2));
        Collections.sort(s, new Comparator<>() {
            @Override
            public int compare(Student a, Student b) {
                return a.getiDNumber() - b.getiDNumber();
            }
        });
        System.out.println(s);
        ArrayList<Student> d=new  ArrayList<>();
        d.add(new Student("Uli",1));
        d.add(new Student("Andre",2));
        d.add(new Student("Max",3));
        s.addAll(d);
        System.out.println(s);
        Collections.sort(s, new Comparator<>() {
            @Override
            public int compare(Student a, Student b) {
                return a.getiDNumber() - b.getiDNumber();
            }
        });
        System.out.println(s);
    }
}
