package Project;

public class Cartesian_tree {
    public static vertex Merge(vertex l,vertex r){
        if(l==null || r==null){
            return (l==null ? r : l);
        }
        if(l.Y > r.Y){
            l.r=Merge(l.r,r);
            return l;
        }
        else{
            r.l=Merge(l,r.l);
            return r;
        }
    }
    public static Pair<vertex,vertex> Split(vertex t,int key){
        vertex l=null,r=null;
        if(t==null)
            return new Pair<>(l,r);
        if(t.X<=key){
            l=t;
            var a=Split(l.r,key);
            l.r=a.getFirst();
            r=a.getSecond();
        }
        else{
            r=t;
            var a=Split(r.l,key);
            r.l=a.getSecond();
            l=a.getFirst();
        }
        return new Pair<>(l,r);
    }
}
