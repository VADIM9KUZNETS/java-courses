import java.util.Scanner;
public class ConditionalOperatorANDarithmetic22 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a < 5) {
            if (b < 5)
                if (c >= 5)
                    System.out.println("YES");
        }
        if (b < 5) {
            if (c < 5)
                if (a >= 5)
                    System.out.println("YES");
        }
        if (c < 5){
            if (a < 5)
                if (b >= 5)
                    System.out.println("YES");
        }
        if (a >= 5) {
            if (b >= 5)
                if (c < 5)
                    System.out.println("NO");
        }
        if (b >= 5) {
            if (c >= 5)
                if (a < 5)
                    System.out.println("NO");
        }
        if (c >= 5){
            if (a >= 5)
                if (b < 5)
                    System.out.println("NO");
        }
        if (a >= 5) {
            if (b >= 5)
                if (c >= 5)
                    System.out.println("NO");
        }
        if (a < 5) {
            if (b < 5)
                if (c < 5)
                    System.out.println("NO");
        }
    }
    }