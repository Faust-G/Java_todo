package task15;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String filePath = "C:\\Users\\Slava\\Desktop\\input2.txt";
        Files.write(Paths.get(filePath), text.getBytes());
        List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        for(var i: lines){
            System.out.println(i);
        }
        text=sc.nextLine();
        Files.write(Paths.get(filePath), (text+"\n").getBytes());
        text=sc.nextLine();
        Files.write(Paths.get(filePath), text.getBytes(),StandardOpenOption.APPEND);
        lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        for(var i: lines){
            System.out.println(i);
        }
    }
}
