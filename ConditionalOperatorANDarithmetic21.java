import java.util.Scanner;
public class ConditionalOperatorANDarithmetic21 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a > 30){
            if (b <= 30)
                System.out.println("YES");
        }
        if (b > 30){
            if (a <= 30)
                System.out.println("YES");
        }
        if (a > 30){
            if (b > 30)
                System.out.println("YES");
        }
        if (a <= 30){
            if (b <= 30)
                System.out.println("NO");
        }
    }
    }
