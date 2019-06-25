import java.util.Scanner;
public class Arithmetic5 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("The sum:" + (num1 + num2));
        System.out.println("Multiplication:" + (num1 * num2));
    }
}