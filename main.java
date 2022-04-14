import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Type the temperature in C");
        int number = sc.nextInt();
        System.out.println("Here u go. It's in F");
        System.out.println(number*1.8+32);
        System.out.println("Now type in F");
        int number1 = sc.nextInt();
        System.out.println("Now its C");
        System.out.println((number1-32)/1.8);
    }

}
