import java.util.Scanner;

public class LCMandGCF {        // LeastCommonMultiply and GreatestCommonFactor
    public static void main(String[] args) {
        result();
    }

    static void result() {
        Scanner inputValue = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        while(true) {
            try {
                System.out.print("Input first number: ");
                firstNumber = inputValue.nextInt();
                System.out.print("Input second number: ");
                secondNumber = inputValue.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.err.println("Inputted value is not a number!");
            }
        }
        System.out.println(
                "GCF : LCM - " +
                GCF(firstNumber, secondNumber) +
                " : " +
                LCM(firstNumber, secondNumber)
        );
    }

    static int GCF(int firstInput, int secondInput) {
        return secondInput == 0 ? firstInput : GCF(secondInput, firstInput % secondInput);
    }

    static int LCM( int firstInput, int secondInput ) {
        return (firstInput * secondInput) / GCF(firstInput, secondInput);
    }
}
