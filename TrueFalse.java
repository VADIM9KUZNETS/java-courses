import java.util.Scanner;
public class TrueFalse {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num > 5){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}