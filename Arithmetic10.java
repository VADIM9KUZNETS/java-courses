import java.util.Scanner;
public class Arithmetic10 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double x1;
        double x2;
        System.out.println("Price:" + (x1 = (300 * num1)/1000));
        System.out.println("Price:" + (x2 = (400 * num2)/1000));
    }
}