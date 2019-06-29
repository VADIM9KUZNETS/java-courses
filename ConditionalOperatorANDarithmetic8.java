import java.util.Scanner;
public class ConditionalOperatorANDarithmetic8 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num <= -100){
            System.out.println("num = " + 0);
        } else if (num >= 100){
            System.out.println("num = " + 0);
        } else {
            System.out.println(num + 1);
        }
        }
    }