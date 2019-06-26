import java.util.Scanner;
public class Arithmetic7 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println("Double the number:" + (num1 * 2));
        System.out.println("To reduce the number to three:" + (num2 - 3));
        System.out.println("The numbers in the square:" + Math.pow(num3, 2));
        System.out.println("The sum of the numbers:" +((num1 * 2) + (num2 - 3) + Math.pow(num3, 2)));
    }
}