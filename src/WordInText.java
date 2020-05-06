import java.util.Scanner;

public class WordInText {
    public static void main(String[] args) {
        result();
    }

    static void result() {
        Scanner inputValue = new Scanner(System.in);
        String sentence;
        String word;
        while(true) {
            try {
                System.out.print("Input sentence: ");
                sentence = inputValue.nextLine();
                System.out.print("Input word: ");
                word = inputValue.nextLine();
                break;
            } catch (NumberFormatException ignored) {}
        }
        System.out.println(
                "Inputted sentence: " + sentence +
                        "\nCount of words: " + CountOfWord(sentence, word)
        );
    }

    static int CountOfWord(String sentence, String word) {
        int countOfWord = 0;

        for(String elem : sentence.split(" ")) {
            if(elem.toLowerCase().equals(word.toLowerCase())) {
                countOfWord++;
            }
        }

        return countOfWord;
    }
}
