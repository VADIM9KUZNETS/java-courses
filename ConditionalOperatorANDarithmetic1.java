import java.util.Scanner;
public class ConditionalOperatorANDarithmetic1 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num > 3){
            System.out.println(num +10);
        } else {
            System.out.println(num -10);
        }
    }
}