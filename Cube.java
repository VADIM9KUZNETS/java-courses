import java.util.Scanner;
public class Cube {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println("The number in the cube:" + (num * num *num));
    }
}