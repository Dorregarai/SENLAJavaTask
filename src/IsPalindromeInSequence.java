import java.util.Scanner;

public class IsPalindromeInSequence {
    public static void main(String[] args) {
        result();
    }

    static void result() {
        Scanner inputValue = new Scanner(System.in);
        int inputNumber;
        while(true) {
            try {
                System.out.print("Input number: ");
                inputNumber = inputValue.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.err.println("Inputted value is not a number!");
            }
        }
        String not = "";
        if(!IsPalindrome(inputNumber)) {
            not = "not ";
        }
        System.out.println("Inputted number is " + not + "palindrome");
    }

    static boolean IsPalindrome(int inputtedNumber) {
        boolean verdict = true;
        String inputtedNumberToString = Integer.toString(inputtedNumber);
        int stringLength = inputtedNumberToString.length();

        for(int i = 0; i < stringLength / 2; i ++) {
            if(inputtedNumberToString.charAt(i) != inputtedNumberToString.charAt(stringLength - i - 1)) {
                verdict = false;
                break;
            }
        }

        return verdict;
    }
}
