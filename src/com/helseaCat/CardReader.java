package com.helseaCat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CardReader {
    static private ArrayList<BaseFlashCard> cards = new ArrayList<>();

    static {
        FlashCardMultipleChoice multiCard;
        FlashCardTrueOrFalse tfCard;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("data/questions.txt")));
            String[] ins = scanner.nextLine().split(";");
            while(scanner.hasNextLine()){
                if (Integer.parseInt(ins[0]) == 4) {
                    cards.add(multiCard = new FlashCardMultipleChoice());
                    scanner.nextLine();
                }
                else {
                    cards.add(tfCard = new FlashCardTrueOrFalse());
                    scanner.nextLine();
                }
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
