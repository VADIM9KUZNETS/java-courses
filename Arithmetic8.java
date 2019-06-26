import java.util.Scanner;
public class Arithmetic8 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println("Average:" + (num1 + num2 + num3)/2);
        System.out.println((2 *(num1 + num3)) - (3 * num2));
    }
}