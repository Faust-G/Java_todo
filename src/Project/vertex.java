package Project;

public class vertex {
    int X,Y;
    vertex l=null,r=null;
    public vertex(int value){
        X=value;
        Y=(int)(Math.random()*1e9);
    }
}
