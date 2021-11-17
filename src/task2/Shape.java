package task2;

public class Shape {
    private String figure;
    private int r;
    public Shape(String figure, int r){
        this.figure=figure;
        this.r=r;
    }
    public Shape(String figure){
        this.figure=figure;
        r=0;
    }
    public Shape(){
        figure="square";
        r=5;
    }
    public void setfigure(String figure){
        this.figure=figure;
    }
    public void setR(int r){
        this.r=r;
    }
    public int getR(){
        return r;
    }
    public String getfigure(){
        return figure;
    }
    public String toString(){
        return "figure = "+figure+", radius = "+r;
    }
}