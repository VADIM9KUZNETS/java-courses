import java.util.Scanner;
public class Puzzle {
    public static void main(String[] arg) {
        String answer;
        boolean exit;
        System.out.println("What is it: blue, big, with a mustache and completely stuffed with hares?");
        Scanner sc = new Scanner(System.in);
        exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit == true)
                break;
                answer = sc.next();
                switch (answer){
                case("Trolleybus"):
                    System.out.println("That's right!");
                    exit = true;
                    break;
                case ("Surrender"):
                    System.out.println("The correct answer: trolley.");
                    exit = true;
                default:
                    System.out.println("Think again.");
                }
        }
    }
}
