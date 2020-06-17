import java.util.Scanner;

public class FactorialValue10 {

    static int factorial(int n) {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    // Driver method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}