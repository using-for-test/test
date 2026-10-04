import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();

        // Total number of rows = 2*n - 1
        for (int i = 1; i <= 2 * n - 1; i++) {

            // Determine the current level
            int level;

            if (i <= n) {
                level = i;
            } else {
                level = 2 * n - i;
            }

            // Print spaces
            for (int space = 1; space <= n - level; space++) {
                System.out.print(" ");
            }

            // Print increasing characters
            for (int j = 0; j < level; j++) {
                System.out.print((char)('A' + j));
            }

            // Print decreasing characters
            for (int j = level - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }

        input.close();
    }
}
