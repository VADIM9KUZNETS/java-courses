import java.util.Scanner;
public class Arithmetic12 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("The square:" + (0.5*num1*num2));
        System.out.println("Perimeter:" + (num1 + num2 + (Math.sqrt(num1*num1 + num2*num2))));
        System.out.println("Hypotenuse:" + (Math.sqrt(num1*num1 + num2*num2)));
    }
}