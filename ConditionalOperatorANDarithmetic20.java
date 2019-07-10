import java.util.Scanner;
public class ConditionalOperatorANDarithmetic20 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        if (a > 5){
            if (b > 5)
                if (c % 6 == 0)
                    if (d % 3 != 0)
                        System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    }