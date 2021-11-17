package task2;

public class Ball {
    private String color;
    private int r;
    public Ball(String color,int r){
        this.color=color;
        this.r=r;
    }
    public Ball(String color){
        this.color=color;
        r=0;
    }
    public Ball(){
        color="green";
        r=5;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setR(int r){
        this.r=r;
    }
    public int getR(){
        return r;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return "color = "+color+", radius = "+r;
    }
    public void intoMetres(){
        System.out.print(color+", "+r*0.01 + "\n");
    }
}
