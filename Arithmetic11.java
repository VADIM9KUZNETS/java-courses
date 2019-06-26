import java.util.Scanner;
public class Arithmetic11 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double v;
        System.out.println("Speed:" + ((v = (100*num1)/(6*num2))));
    }
}