package com.helseaCat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CardReader {
    static private final ArrayList<BaseFlashCard> cards = new ArrayList<>();

    static {
        FlashCardMultipleChoice multiCard;
        FlashCardTrueOrFalse tfCard;
        try {
            Scanner scanner1 = new Scanner(new BufferedReader(new FileReader("data/questions.txt")));
            Scanner scanner2 = new Scanner(new BufferedReader(new FileReader("data/choices.txt")));
            Scanner scanner3 = new Scanner(new BufferedReader(new FileReader("data/answers.txt")));
            String[] question = scanner1.nextLine().split(";");
            while(scanner1.hasNextLine()){
                if (Integer.parseInt(question[0]) == 4) {
                    multiCard = new FlashCardMultipleChoice();
                    multiCard.setNumberOfChoices(4);
                    multiCard.setTheQuestion(question[1]);
                    String[] choices = new String[4];
                    for(int i = 0; i < 4; i++){
                        choices[i] = scanner2.nextLine();
                    }
                    multiCard.setAnswerChoices(choices);
                    int[] answers = new int[4];
                    String[] answersIns = scanner3.nextLine().split(";");
                    for(int i = 0; i < 4; i++){
                        answers[i] = Integer.parseInt(answersIns[i]);
                    }
                    multiCard.setCorrectAnswer(answers);
                    cards.add(multiCard);
                }
                else {
                    tfCard = new FlashCardTrueOrFalse();
                    tfCard.setNumberOfChoices(2);
                    tfCard.setTheQuestion(question[1]);
                    String answersIns = scanner3.nextLine();
                    tfCard.setCorrectAnswer(answersIns.);
                    cards.add(tfCard);
                }
                question = scanner1.nextLine().split(";");
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
