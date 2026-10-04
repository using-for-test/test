class DivisorThread extends Thread {

    private int start;
    private int end;

    private int maxDivisors = 0;
    private int numberWithMaxDivisors = 0;

    // Constructor
    public DivisorThread(String name, int start, int end) {
        super(name);
        this.start = start;
        this.end = end;
    }

    // Count divisors of a number
    private int countDivisors(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }

    // Thread's work
    public void run() {

        for (int n = start; n <= end; n++) {

            int divisors = countDivisors(n);

            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                numberWithMaxDivisors = n;
            }
        }

        System.out.println(
            "Thread " + getName()
            + " found: " + numberWithMaxDivisors
            + " with " + maxDivisors + " divisors"
        );
    }

    // Getter methods
    public int getMaxDivisors() {
        return maxDivisors;
    }

    public int getNumberWithMaxDivisors() {
        return numberWithMaxDivisors;
    }
}


public class Main {

    public static void main(String[] args) {

        // Divide 1 to 10000 into 3 parts

        DivisorThread A =
            new DivisorThread("A", 1, 3333);

        DivisorThread B =
            new DivisorThread("B", 3334, 6666);

        DivisorThread C =
            new DivisorThread("C", 6667, 10000);

        // Start all threads
        A.start();
        B.start();
        C.start();

        try {
            // Wait for all threads to finish
            A.join();
            B.join();
            C.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the overall maximum
        int maxDivisors = A.getMaxDivisors();
        int number = A.getNumberWithMaxDivisors();

        if (B.getMaxDivisors() > maxDivisors) {
            maxDivisors = B.getMaxDivisors();
            number = B.getNumberWithMaxDivisors();
        }

        if (C.getMaxDivisors() > maxDivisors) {
            maxDivisors = C.getMaxDivisors();
            number = C.getNumberWithMaxDivisors();
        }

        // Final result
        System.out.println();
        System.out.println("Overall Result:");
        System.out.println("Number: " + number);
        System.out.println("Number of divisors: " + maxDivisors);
    }
}
