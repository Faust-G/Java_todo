package task2;

import java.util.Scanner;

public class TestDog {
    private Dog[] arr;

    public TestDog(int n){
        Scanner sc=new Scanner(System.in);
        arr=new Dog[n];
        for(int i=0;i<n;++i){
            System.out.print("insert name: ");
            String s=sc.next();
            System.out.print("insert age: ");
            int r=sc.nextInt();
            arr[i]=new Dog(s,r);
        }
    }
    public void printer() {
        for(var i:arr){
            System.out.println("name "+i.getname());
            System.out.println("age "+i.getage());
        }
    }
}
