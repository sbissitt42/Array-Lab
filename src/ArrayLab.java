import java.util.Scanner;

public class ArrayLab {
    public static void main(String[] args) {
        final int MAX_VALUES = 20;
        double[] values = new double[MAX_VALUES];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter double values (enter 99999 to quit):");

        while (count < MAX_VALUES) {
            System.out.print("Enter a value: ");
            double inputValue = scanner.nextDouble();

            if (inputValue == 99999) {
                break; // Exit loop if 99999 is entered
            }

            values[count] = inputValue;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No values entered!");
        } else {
            System.out.println("Entered values:");
            for (int i = 0; i < count; i++) {
                System.out.println(values[i]);
            }
        }

        scanner.close();
    }
}
