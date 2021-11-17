package task6;

public class Phone implements Nameable, Priceable {
    private String name;
    private int price;
    public Phone(String name,int price){
        this.name=name;
        this.price=price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getPrice() {
        return price;
    }
}