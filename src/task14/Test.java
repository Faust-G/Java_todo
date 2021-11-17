package task14;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        ArrayDeque<Integer> s1 = new  ArrayDeque<>();
        ArrayDeque<Integer> s2 = new  ArrayDeque<>();
        System.out.println("Первый игрок");
        for(int i=0;i<5;++i){
            System.out.print(" Введите число: ");
            s1.add(r.nextInt());
        }
        System.out.println("Второй игрок");
        for(int i=0;i<5;++i){
            System.out.print(" Введите число: ");
            s2.add(r.nextInt());
        }
        for(int i=0;i<106;++i){
            ++i;
            System.out.println("Ход "+i+":");
            System.out.println(" Карта первого игрока: "+s1.getFirst());
            System.out.println(" Карта второго игрока: "+s2.getFirst());
            if(s1.getFirst()>s2.getFirst() && s1.getFirst()!=9 && s2.getFirst()!=0 ){
                System.out.println(" Первый победил");
                s1.add(s1.getFirst());
                s1.add(s2.getFirst());
                s1.removeFirst();
                s2.removeFirst();
                if(s2.size()==0) {
                    System.out.println();
                    System.out.println("first " + i);
                    break;
                }
            }
            else{
                System.out.println(" Второй победил");
                s2.add(s1.getFirst());
                s2.add(s2.getFirst());
                s1.removeFirst();
                s2.removeFirst();
                if(s1.size()==0) {
                    System.out.println();
                    System.out.println("second " + i);
                    break;
                }
            }
            if(i==105 && s1.size()!=0 && s2.size()!=0) {
                System.out.println();
                System.out.println("botva");
            }
            --i;
        }
    }
}
