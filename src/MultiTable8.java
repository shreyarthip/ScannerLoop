import java.util.Scanner;

public class MultiTable8 {

    public static void main(String[] args) {

        int row, column, y;
        row = 1;
        System.out.println("Multiplication Table \n");

        do {
            column = 1;
            do {
                y = row * column;
                System.out.println("" + y);
                column = column + 1;
            }
            while (column <= 3);
            System.out.println("\n");
            row = row + 1;
        }
            while (row <= 3) ;




    }

}


