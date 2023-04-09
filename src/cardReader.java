import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class cardReader {
    static private ArrayList<BaseFlashCard> cards = new ArrayList<>();

    static {
        FlashCardMultipleChoice multiCard;
        FlashCardTrueOrFalse tfCard;
        Scanner scanner;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("questions.txt")));
            String[] ins = scanner.nextLine().split(";");
            if (Integer.parseInt(ins[0]) == 4) {
                cards.add(multiCard = new FlashCardMultipleChoice());
            }
            else {
                cards.add(tfCard = new FlashCardTrueOrFalse());
            }
        }
        catch (IOException e) {
            e.getStackTrace();
        }

    }

    public ArrayList<BaseFlashCard> getCards() {
        return cards;
    }
}
