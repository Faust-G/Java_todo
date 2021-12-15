package Project;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>(5);
        for( int i=0;i<5;++i){
            a.add(i);
        }
        Max_tree tr=new Max_tree(a);
        System.out.println(a);
        System.out.println(tr.get(1,3));
        tr.change(0,3,100);
        System.out.println(tr.get(1,3));
        Min_tree tr2=new Min_tree(a);
        System.out.println(a);
        System.out.println(tr2.get(1,3));
        tr2.change(0,3,100);
        System.out.println(tr2.get(1,3));
        Sum_tree tr3=new Sum_tree(a);
        System.out.println(a);
        System.out.println(tr3.get(1,3));
        tr3.change(0,3,100);
        System.out.println(tr3.get(1,3));
        vertex f=new vertex(5);
        vertex g=new vertex(6);
        vertex t=Cartesian_tree.Merge(f,g);
        var l=Cartesian_tree.Split(t,6);
    }
}
