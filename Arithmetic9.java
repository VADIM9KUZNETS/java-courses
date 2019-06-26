import java.util.Scanner;
public class Arithmetic9 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println("Perimeter:" + (num * 4));
        System.out.println("Square:" + (Math.pow(num, 2)));
    }
}