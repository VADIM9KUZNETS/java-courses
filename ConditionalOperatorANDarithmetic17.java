import java.util.Scanner;
public class ConditionalOperatorANDarithmetic17 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a % 2 != 0) {
            if (b % 2 != 0)
                if (c % 2 != 0)
                    if (d % 2 != 0)
                        System.out.println("not found");
        } else if (a % 2 == 0) {
            if (b % 2 != 0)
                if (c % 2 != 0)
                    if (d % 2 != 0)
                        System.out.println(a);
        }
        if (a % 2 != 0) {
            if (b % 2 == 0)
                if (c % 2 != 0)
                    if (d % 2 != 0)
                        System.out.println(b);
        }
        if (a % 2 != 0) {
            if (b % 2 != 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        System.out.println(c);
        }
        if (a % 2 != 0) {
            if (b % 2 != 0)
                if (c % 2 != 0)
                    if (d % 2 == 0)
                        System.out.println(d);
        } else if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 != 0)
                    if (d % 2 != 0)
                        if (a > b) {
                            System.out.println(a);
                        } else {
                            System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 != 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (a > c) {
                            System.out.println(a);
                        } else {
                            System.out.println(c);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 != 0)
                if (c % 2 != 0)
                    if (d % 2 == 0)
                        if (a > d) {
                            System.out.println(a);
                        } else {
                            System.out.println(d);
                        }
        }
        if (a % 2 != 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (b > c) {
                            System.out.println(b);
                        } else {
                            System.out.println(c);
                        }
        }
        if (a % 2 != 0) {
            if (b % 2 == 0)
                if (c % 2 != 0)
                    if (d % 2 == 0)
                        if (b > d) {
                            System.out.println(b);
                        } else {
                            System.out.println(d);
                        }
        }
        if (a % 2 != 0) {
            if (b % 2 != 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (c > d) {
                            System.out.println(c);
                        } else {
                            System.out.println(d);
                        }                                  
        } else if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (a > b) {
                            if (a > c)
                                System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (b > c) {
                            if (b > a)
                                System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (c > a) {
                            if (c > b)
                                System.out.println(c);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (a > b) {
                            if (a == c)
                                System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (b > c) {
                            if (b == a)
                                System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (c > a) {
                            if (c == b)
                                System.out.println(c);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 != 0)
                        if (a == b) {
                            if (b == c)
                                System.out.println(a);
                        }
        }
        if (b % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (a % 2 != 0)
                        if (b > c) {
                            if (b > d)
                                System.out.println(b);
                        }
        }
        if (b % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (a % 2 != 0)
                        if (c > d) {
                            if (c > b)
                                System.out.println(c);
                        }
        }
        if (b % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (a % 2 != 0)
                        if (d > b) {
                            if (d > c)
                                System.out.println(d);
                        }
        }
        if (b % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (a % 2 != 0)
                        if (b > c) {
                            if (b == d)
                                System.out.println(b);
                        }
        }
        if (b % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (a % 2 != 0)
                        if (c > d) {
                            if (c == b)
                                System.out.println(c);
                        }
        }
        if (b % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (a % 2 != 0)
                        if (d > b) {
                            if (d == c)
                                System.out.println(d);
                        }
        }
        if (b % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (a % 2 != 0)
                        if (b == c) {
                            if (b == d)
                                System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (b % 2 != 0)
                        if (a > c) {
                            if (a > d)
                                System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (b % 2 != 0)
                        if (c > d) {
                            if (c > a)
                                System.out.println(c);
                        }
        }
        if (a % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (b % 2 != 0)
                        if (d > a) {
                            if (d > c)
                                System.out.println(d);
                        }
        }
        if (a % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (b % 2 != 0)
                        if (a > c) {
                            if (a == d)
                                System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (b % 2 != 0)
                        if (c > d) {
                            if (c == a)
                                System.out.println(c);
                        }
        }
        if (a % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (b % 2 != 0)
                        if (d > a) {
                            if (d == c)
                                System.out.println(d);
                        }
        }
        if (a % 2 == 0) {
            if (c % 2 == 0)
                if (d % 2 == 0)
                    if (b % 2 != 0)
                        if (a == c) {
                            if (a == d)
                                System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (d % 2 == 0)
                    if (c % 2 != 0)
                        if (a > b) {
                            if (a > d)
                                System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (d % 2 == 0)
                    if (c % 2 != 0)
                        if (b > d) {
                            if (b > a)
                                System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (d % 2 == 0)
                    if (c % 2 != 0)
                        if (d > a) {
                            if (d > b)
                                System.out.println(d);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (d % 2 == 0)
                    if (c % 2 != 0)
                        if (a > b) {
                            if (a == d)
                                System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (d % 2 == 0)
                    if (c % 2 != 0)
                        if (b > d) {
                            if (b == a)
                                System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (d % 2 == 0)
                    if (c % 2 != 0)
                        if (d > a) {
                            if (d == b)
                                System.out.println(d);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (d % 2 == 0)
                    if (c % 2 != 0)
                        if (a == b) {
                            if (a == d)
                                System.out.println(a);
                        }
        } if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (a > b) {
                            if (a > c)
                                if (a > d)
                                    System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (b > c) {
                            if (b > d)
                                if (b > a)
                                    System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (c > d){
                            if (c > a)
                                if (c > b)
                                    System.out.println(c);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (d > a){
                            if (d > b)
                                if (d > c)
                                    System.out.println(d);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (a > b) {
                            if (a > c)
                                if (a == d)
                                    System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (b > c) {
                            if (b > d)
                                if (b == a)
                                    System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (c > d){
                            if (c > a)
                                if (c == b)
                                    System.out.println(c);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (d > a){
                            if (d > b)
                                if (d == c)
                                    System.out.println(d);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (a > b) {
                            if (a == c)
                                if (a == d)
                                    System.out.println(a);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (b > c) {
                            if (b == d)
                                if (b == a)
                                    System.out.println(b);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (c > d){
                            if (c == a)
                                if (c == b)
                                    System.out.println(c);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (d > a){
                            if (d == b)
                                if (d == c)
                                    System.out.println(d);
                        }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0)
                if (c % 2 == 0)
                    if (d % 2 == 0)
                        if (a == b) {
                            if (a == c)
                                if (a == d)
                                    System.out.println(a);
                        }
        }
    }
}
