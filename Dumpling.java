import java.util.Scanner;
public class Dumpling {
    public static void main(String[] arg) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 5){
            System.out.println("Here's the lucky dumpling!");
        } else {
            System.out.println("The usual dumpling!");
        }
    }
}
