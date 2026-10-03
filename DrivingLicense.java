import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class DrivingLicense {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        try {

            if (age < 18) {
                throw new InvalidAgeException(
                    "Age must be 18 or above to apply for a driving license."
                );
            }

            System.out.println("You are eligible to apply for a driving license.");

        } catch (InvalidAgeException e) {

            System.out.println("InvalidAgeException: " + e.getMessage());
        }

        input.close();
    }
}
