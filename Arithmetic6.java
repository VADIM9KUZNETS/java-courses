import java.util.Scanner;
public class Arithmetic6 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println("The numbers in the square:" + Math.pow(num, 2));
        System.out.println("The numbers in the cube:" + Math.pow(num, 3));
    }
}