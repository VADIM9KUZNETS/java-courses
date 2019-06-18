import java.util.Scanner;
public class Even {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("The number is odd");
        }
    }
}