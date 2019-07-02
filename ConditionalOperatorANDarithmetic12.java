import java.util.Scanner;
public class ConditionalOperatorANDarithmetic12 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 <= 10) {
            System.out.println("NO!");
        } else if (num1 % 3 != 0) {
            System.out.println("NO!");
        } else if (num2 <= 10) {
            System.out.println("NO!");
        } else if (num2 % 3 != 0) {
            System.out.println("NO!");
        } else if (num3 <= 10) {
            System.out.println("NO!");
        } else {
            System.out.println("YES!");
        }
    }
}