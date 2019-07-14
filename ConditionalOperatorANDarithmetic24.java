import java.util.Scanner;
public class ConditionalOperatorANDarithmetic24 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        if (s == 11){
            if (n == -1)
                System.out.println("North - East");
        }
        if (s == 14){
            if (n == -1)
                System.out.println("East - South");
        }
        if (s == 13){
            if (n == -1)
                System.out.println("South - West");
        }
        if (s == 12){
            if (n == -1)
                System.out.println("West - North");
        }
        if (s == 11){
            if (n == 1)
                System.out.println("North - West");
        }
        if (s == 12){
            if (n == 1)
                System.out.println("West - South");
        }
        if (s == 13){
            if (n == 1)
                System.out.println("South - East");
        }
        if (s == 14){
            if (n == 1)
                System.out.println("East - North");
        }
    }
    }
