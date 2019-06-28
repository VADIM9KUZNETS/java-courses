import java.util.Scanner;
public class ConditionalOperatorANDarithmetic {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if ((Math.sqrt(x + (-1)*Math.sqrt(y))) >= 0){
            System.out.println((Math.sqrt(x + (-1)*Math.sqrt(y))));
        } else {
            System.out.println("From a negative number square root is not extracted");
        }
    }
}