package task2;

public class Book {
    private String title;
    private int num;
    public Book(String title, int num){
        this.title=title;
        this.num=num;
    }
    public Book(String title){
        this.title=title;
        num=0;
    }
    public Book(){
        title="War and Peace";
        num=843;
    }
    public void settitle(String title){
        this.title=title;
    }
    public void setnum(int num){
        this.num=num;
    }
    public int getnum(){
        return num;
    }
    public String gettitle(){
        return title;
    }
    public String toString(){
        return "title = "+title+", number = "+num;
    }
}