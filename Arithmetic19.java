import java.util.Scanner;
public class Arithmetic19 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble();
        double percent = sc.nextDouble();
        int period = 5;
        System.out.println("final amount:" +(sum + (percent*sum*period/100)));
    }
}