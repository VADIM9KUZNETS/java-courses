import java.util.Scanner;
public class ConditionalOperatorANDarithmetic9 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num < 2){
            System.out.println("num = " + 0);
        } else if (num > 5){
            System.out.println("num = " + 0);
        } else {
            System.out.println(num + 10);
        }
        if (num <= 7){
            System.out.println("num = " + 0);
        } else if (num >= 40){
            System.out.println("num = " + 0);
        } else {
            System.out.println(num - 100);
        }
        if (num <= 0){
            System.out.println(num * 3);
        } else if (num > 3000){
            System.out.println(num * 3);
        } else {
            System.out.println("num = " + 0);
        }
    }
}