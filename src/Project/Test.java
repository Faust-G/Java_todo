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
        System.out.println(tr.get(3,3));
        tr.change(0,3,100);
        System.out.println(tr.get(1,1));
    }
}
