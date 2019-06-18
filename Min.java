import java.util.Scanner;
public class Min {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if (num1 > num2){
            System.out.println("Min:" + num2);
        } else {
            System.out.println("Min:" + num1);
        }
    }
}