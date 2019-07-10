import java.util.Scanner;
public class ConditionalOperatorANDarithmetic18 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a == b) {
            if (a != c)
                System.out.println("YES");
        }
        if (b == c) {
            if (b != a)
                System.out.println("YES");
        }
        if (c == a) {
            if (c != b)
                System.out.println("YES");
        }
        if (a == b) {
            if (a == c)
                System.out.println("YES");
        }
    }
}
