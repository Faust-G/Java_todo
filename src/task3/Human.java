package task3;

import java.util.Scanner;

public class Human {
    public Head h;
    public Leg l;
    public Hand ha;
    public Human(){
        var sc=new Scanner(System.in);
        System.out.print("insert color: ");
        h=new Head(sc.next());
        System.out.print("insert lenth: ");
        l=new Leg(sc.nextInt());
        System.out.print("insert lenth: ");
        ha=new Hand(sc.nextInt());
    }
    public class Head{
        private String color;
        public Head(String color){
            this.color=color;
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
    }
    public class Leg{
        private int lenth;
        public Leg(int lenth){
            this.lenth=lenth;
        }
        public int getLenth() {
            return lenth;
        }

        public void setLenth(int lenth) {
            this.lenth = lenth;
        }
    }
    public class Hand{
        private int lenth;
        public Hand(int lenth){
            this.lenth=lenth;
        }
        public int getLenth() {
            return lenth;
        }

        public void setLenth(int lenth) {
            this.lenth = lenth;
        }
    }
}
