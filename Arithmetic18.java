import java.util.Scanner;
public class Arithmetic18 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.println("x = " + (x + y));
        System.out.println("y = " + (z - x));
        System.out.println("z = " + (x + y + z));
    }
}