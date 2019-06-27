import java.util.Scanner;
public class Arithmetic13 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println("Fahrenheit temperature:" + ((1.8*num) + 32));
    }
}