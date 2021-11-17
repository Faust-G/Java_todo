package task3;

public class BookTest {
    public static void main(String[] args) {
        Book pt = new Book();
        pt.setName("Lev Tolstoy");
        pt.setTitle("War and peace");
        pt.setX(1869);
        System.out.print(pt.getName());
        System.out.print('\n');
        System.out.print(pt.getTitle());
        System.out.print('\n');
        System.out.print(pt.getX());
        System.out.print('\n');
    }
}
