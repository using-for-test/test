import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        double d = Math.sqrt(56);

        while (a > 0) {
            System.out.println(1 + (int)(Math.random()*99));
            a--;
        }
    }
}
