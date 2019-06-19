import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] arg) {
        System.out.println("ax2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        double a, b, c, D;
        double x1, x2;
        System.out.println("Enter a:");
        a = sc.nextDouble();
        System.out.println("Enter b:");
        b = sc.nextDouble();
        System.out.println("Enter c:");
        c = sc.nextDouble();
        D = (b * b) - 4 * a * c;
        if (D > 0){
        x1 = ((-1)*b + Math.sqrt(D)) / (2 * a);
        x2 = ((-1)*b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ";" + "x2 = " + x2);
        } else if (D == 0){
            x1 = ((-1)*b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("If D is negative, the equation has no roots");
        }
    }
    }