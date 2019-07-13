import java.util.Scanner;
public class ConditionalOperatorANDarithmetic23 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a >= 0){
            if (b >= 0)
                if (c >= 0)
                    System.out.println("Positive numbers:" + 3);
        }
        if (a >= 0){
            if (b >= 0)
                if (c < 0)
                    System.out.println("Positive numbers:" + 2);
        }
        if (a >= 0){
            if (b < 0)
                if (c < 0)
                    System.out.println("Positive numbers:" + 1);
        }
        if (a < 0){
            if (b < 0)
                if (c < 0)
                    System.out.println("Positive numbers:" + 0);
        }
        if (a < 0){
            if (b > 0)
                if (c > 0)
                    System.out.println("Positive numbers:" + 2);
        }
        if (a < 0){
            if (b < 0)
                if (c > 0)
                    System.out.println("Positive numbers:" + 1);
        }
    }
    }