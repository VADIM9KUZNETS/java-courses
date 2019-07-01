import java.util.Scanner;
public class ConditionalOperatorANDarithmetic11 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 == 10) {
            System.out.println(num1 * num2);
        } else if (num2 == 10) {
            System.out.println(num1 * num2);
        } else if (num1 % 2 == 0) {
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 * num2);
        }
    }
}