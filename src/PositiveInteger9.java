import java.util.Scanner;

public class PositiveInteger9
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Positive number");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++)
        {

            if (num > 0)
            {
                System.out.println(num + "*" + i + "=" + (num * i));
            }
        }
    }
}

