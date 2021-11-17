package task10;
import java.util.ArrayList;
import java.util.Arrays;
public class Rec {
    public static void main(String[] args) {
        f3(3,6);
        ArrayList<String> v =new ArrayList<>();
        f4(v,"",2,12);
        for(var i:v)
            System.out.print(i+' ');
        System.out.println();
        System.out.println(f5(999));
        System.out.println(f6(20,2));
        f7(777,2);
    }
    public static void f3(int a,int b){
        if(a<=b) {
            System.out.print(a + ' ');
            f3(a + 1, b);
        }
        else System.out.println();
    }
    public static void f4(ArrayList<String> v, String s, int k, int d){
        if(s.length()==k ){
           if(f5(Integer.parseInt(s))==d && s.charAt(0)!='0')
                v.add(s);
           return;
        }
        for(char c='0';c<='9';++c)
            f4(v,s+c,k,d);
    }
    public static int f5(int x){
        if(x==0)
            return 0;
        return x%10+f5(x/10);
    }
    public static boolean f6(int x,int k){
        if(k==x)
            return true;
        if(x%k==0)
            return false;
        return f6(x,k+1);
    }
    public static void f7(int x,int k){
        if(x==1)
            return;
        while(x%k==0){
            System.out.print(k+" ");
            x/=k;
        }
        f7(x,k+1);
    }
}
