import java.util.Scanner;
public class ConditionalOperatorANDarithmetic6 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double n1;
        double n2;
        if (num1 > num2){
            System.out.println("Yes");
        } else {
            System.out.println("num1 <= num2.Enter the number:");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            System.out.println(n1);
            System.out.println(n2);
        }
    }
}