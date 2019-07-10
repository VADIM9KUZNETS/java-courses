import java.util.Scanner;
public class ConditionalOperatorANDarithmetic19 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b == c){
            System.out.println("YES");
        }
        if (b + c == a){
            System.out.println("YES");
        }
        if (c + a == b){
            System.out.println("YES");
        }
        }
    }