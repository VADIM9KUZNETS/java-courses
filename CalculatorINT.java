import java.util.Scanner;
public class CalculatorINT {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg) {
int num1 = getNumber();
int num2 = getNumber();
char operation = getOperation();
int result = calc(num1, num2, operation);
        System.out.println("Result:" + result);
    }
    public static int getNumber() {
        System.out.println("Enter the number:");
        int num;
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Error when entering the number. Reenter:");
            sc.next();
            num = getNumber();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println("Enter the operation:");
        char operationNumber;
        if (sc.hasNext()){
            return sc.next().charAt(0);
        } else {
            System.out.println("Error when entering the operation. Reenter");
            sc.next();
            operationNumber = getOperation();
        }
        return operationNumber;
    }
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("The operation is not recognized. Reenter");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}