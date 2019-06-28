import java.util.Scanner;
public class ConditionalOperatorANDarithmetic2 {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num < 7){
            System.out.println("Yes");
        } else if (num > 10){
            System.out.println("No");
        } else if (num == 9){
            System.out.println("Error");
        }
    }
}