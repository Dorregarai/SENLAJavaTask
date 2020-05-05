import java.util.Arrays;
import java.util.Scanner;

public class StringWorks {
    public static void main(String[] args) {
        result();
    }

    static void result() {
        Scanner inputValue = new Scanner(System.in);
        String sentence;
        while(true) {
            try {
                System.out.print("Input sentence: ");
                sentence = inputValue.nextLine();
                break;
            } catch (NumberFormatException ignored) {}
        }
        System.out.println(
                "Inputted sentence: " + sentence +
                        "\nCount of words: " + CountOfWords(sentence) +
                        "\nSorted sentence: " + SortByLength(sentence) +
                        "\nEdited sentence: " + FirstLetterUppercase(sentence)
        );
    }

    static int CountOfWords(String sentence) {
        int countOfWords = 0;

        for(String ignored : sentence.split(" ")) {
            countOfWords ++;
        }

        return countOfWords;
    }

    static String SortByLength(String sentence) {
        String [] sentenceArray = sentence.split(" ");
        Arrays.sort(sentenceArray);

        return Arrays.toString(sentenceArray);
    }

    static String FirstLetterUppercase(String sentence) {
        String [] sentenceArray = sentence.split(" ");

        for(int i = 0; i < sentenceArray.length; i ++){
            String edit = sentenceArray[i].substring(0, 1).toUpperCase() + sentenceArray[i].substring(1);
            sentenceArray[i] = edit;
        }

        return Arrays.toString(sentenceArray);
    }
}
