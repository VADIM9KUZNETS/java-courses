import java.util.Scanner;
public class ConditionalOperatorANDarithmetic16 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if ((a + b) > (b + c)) {
            if ((a + b) > (a + c))
                System.out.println("(a + b) = " + (a + b));
        }
        if ((b + c) > (a + c)) {
            if ((b + c) > (a + b))
                System.out.println("(b + c) = " + (b + c));
        }
        if ((a + c) > (a + b)) {
            if ((a + c) > (b + c))
                System.out.println("(a + c) = " + (a + c));
        }
        if ((a + b) > (b + c)) {
            if ((a + b) == (a + c))
                System.out.println("(a + b) = " + (a + b));
        }
        if ((b + c) > (a + c)) {
            if ((b + c) == (a + b))
                System.out.println("(b + c) = " + (b + c));
        }
        if ((a + c) > (a + b)) {
            if ((a + c) == (b + c))
                System.out.println("(a + c) = " + (a + c));
        }
        if ((a + b) == (b + c)) {
            if ((a + b) == (a + c))
                System.out.println("(a + b) = " + (a + b));
        }
    }
}