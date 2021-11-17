package task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Base {
    public static void main(String[] args) {
        int[]arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println(a1(arr));
        System.out.println(a2(arr));
        System.out.println(a3(arr));
        b(args);
        c();
        d();
        System.out.print(e(3));
    }
    public static int e(int n){
        int k=1;
        for(int i=1;i<=n;++i)
            k*=i;
        return k;
    }
    public static void d(){
        int[] arr=new int[10];
        for(int i=0;i<10;++i){
            if(i%2==0)
                arr[i]=(int)(Math.random()*100);
            else
                arr[i]= new Random().nextInt()%100;
        }
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        Arrays.sort(arr);
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void b(String[] args){
        for(var i:args)
            System.out.println(i);
    }
    public static void c(){
        for(int i=1;i<11;++i)
            System.out.print(1+"/"+i+" ");
        System.out.println();
    }
    public static int a1(int[] arr){
        int sum=0;
        for(int i:arr)
            sum+=i;
        return sum;
    }
    public static int a2(int[] arr){
        int i=0;
        int sum=0;
        while(i<arr.length){
            sum+=arr[i];
            ++i;
        }
        return sum;
    }
    public static int a3(int[] arr){
        if(arr.length==0)
            return -1;
        int i=0;
        int sum=0;
        do{
            sum+=arr[i];
            ++i;
        }while(i<arr.length);
        return sum;
    }
}
