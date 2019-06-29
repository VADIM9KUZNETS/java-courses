import java.util.Scanner;
public class ConditionalOperatorANDarithmetic7 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num <= -10){
            System.out.println(num - 10);
        } else if (num >= 10){
            System.out.println(num - 10);
        } else {
            System.out.println(num + 5);
        }
        }
    }