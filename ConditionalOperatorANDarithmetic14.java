import java.util.Scanner;
public class ConditionalOperatorANDarithmetic14 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 % 5 == 0) {
            if (num2 % 5 == 0)
                if (num3 % 5 == 0)
                    System.out.println(num1 + num2 + num3);
            if (num1 % 5 == 0)
                if (num2 % 5 == 0)
                    if (num3 % 5 != 0)
                        System.out.println(num1 + num2);
            if (num1 % 5 == 0)
                if (num2 % 5 != 0)
                    if (num3 % 5 == 0)
                        System.out.println(num1 + num3);
            if (num1 % 5 == 0)
                if (num2 % 5 != 0)
                    if (num3 % 5 != 0)
                        System.out.println(num1);
        }
        if (num1 % 5 != 0) {
            if (num2 % 5 == 0)
                if (num3 % 5 == 0)
                    System.out.println(num2 + num3);

            if (num1 % 5 != 0)
                if (num2 % 5 == 0)
                    if (num3 % 5 != 0)
                        System.out.println(num2);

            if (num1 % 5 != 0) {
                if (num2 % 5 != 0)
                    if (num3 % 5 == 0)
                        System.out.println(num3);

                if (num1 % 5 != 0)
                    if (num2 % 5 != 0)
                        if (num3 % 5 != 0)
                            System.out.println("ERROR");
            } else {
                System.out.println("ERROR");
            }
        }
    }
}