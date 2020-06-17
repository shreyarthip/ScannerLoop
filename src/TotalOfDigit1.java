import java.util.Scanner;

public class TotalOfDigit1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any Digits of five number");
        int number = sc.nextInt();

        int sum = 0;
        int input = number;
        while (input != 0) {
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10;
        }
        System.out.printf("Sum of digits of number %d is %d", number, sum);

    }
}


