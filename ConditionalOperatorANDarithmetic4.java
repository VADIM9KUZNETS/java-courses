import java.util.Scanner;
public class ConditionalOperatorANDarithmetic4 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if (num1 > num2){
            System.out.println("Max:" + num1);
        } else {
            System.out.println("Max:" + num2);
        }
    }
}
