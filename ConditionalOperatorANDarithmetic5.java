import java.util.Scanner;
public class ConditionalOperatorANDarithmetic5 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if ((num1 + 100) == num2){
            System.out.println("Yes");
        } else if ((num2 + 100) == num1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
