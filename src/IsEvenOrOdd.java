import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        printVerdict();
    }

    static void printVerdict() {
        String verdict = "Check input!";
        if (checking() % 2 != 0) {
            verdict = "Odd";
        } else if (checking() % 2 == 0) {
            verdict = "Even";
        }
        System.out.println(verdict);
    }

    public static int checking() {
        Scanner inputValue = new Scanner(System.in);
        int inputtedNumber;
        while(true) {
            try {
                System.out.print("Input number: ");
                inputtedNumber = inputValue.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.err.println("Inputted value is not a number!");
            }
        }
        return inputtedNumber;
    }
}