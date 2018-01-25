import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        System.out.print("Hello, " + name);
    }
}
