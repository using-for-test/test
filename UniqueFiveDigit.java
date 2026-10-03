public class UniqueFiveDigit {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= 6; j++) {

                for (int k = 1; k <= 6; k++) {

                    for (int l = 1; l <= 6; l++) {

                        for (int m = 1; m <= 6; m++) {

                            // Check that all digits are unique
                            if (i != j &&
                                i != k &&
                                i != l &&
                                i != m &&
                                j != k &&
                                j != l &&
                                j != m &&
                                k != l &&
                                k != m &&
                                l != m) {

                                System.out.println(
                                    "" + i + j + k + l + m
                                );

                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Total unique five-digit numbers: " + count);
    }
}
