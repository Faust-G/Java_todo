package Task13;

public class Myarray {
    private int[] arr;
    private int pos=0;
    public Myarray(int f){
        arr=new int[f];
    }
    public void add(int x){
        arr[pos]=x;
        ++pos;
    }
    public void remove(int x){
        if (pos - 1 - x >= 0) System.arraycopy(arr, x + 1, arr, x, pos - 1 - x);
        --pos;
    }
    public String toString(){
        String s = "";
        for(int i=0;i<pos;++i)
            s=s+arr[i]+" ";
        return s;
    }
}
