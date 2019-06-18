import java.util.Scanner;
public class Extent {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int extent = sc.nextInt();
        double result = 1;
        for (int i = 1; i <= extent; i++) {
            result = result * num;
        }
        System.out.println("Number raised to a power:" + result);
    }
}