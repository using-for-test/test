import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int rows = input.nextInt();

        System.out.println("\nPascal's Triangle:");

        // Normal order
        for (int i = 0; i < rows; i++) {

            // Print spaces
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print("  ");
            }

            int number = 1;

            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");

                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }

        System.out.println("\nReverse Pascal's Triangle:");

        // Reverse order
        for (int i = rows - 1; i >= 0; i--) {

            // Print spaces
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print("  ");
            }

            int number = 1;

            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");

                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }

        input.close();
    }
}
