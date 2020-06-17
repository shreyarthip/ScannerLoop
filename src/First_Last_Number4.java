import java.util.Scanner;

public class First_Last_Number4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number");
        int num = sc.nextInt();
        int ldig =num % 10;
        int fdig = num;

        while (fdig >=10) {
            fdig = fdig / 10;
        }
            System.out.println("First Digit = "+fdig);
            System.out.println("Last Digit = "+ldig);
            System.out.println("sum = "+(fdig+ldig));
    }
}

