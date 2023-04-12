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
//        Scanner scanner;
        try {
            Scanner scanner1 = new Scanner(new BufferedReader(new FileReader("data/questions.txt")));
            String[] ins = scanner1.nextLine().split(";");
            int i = 0;
            while(scanner1.hasNextLine()){
                if (Integer.parseInt(ins[0]) == 4) {
                    multiCard = new FlashCardMultipleChoice();
                    multiCard.setNumberOfChoices(4);
                    multiCard.setTheQuestion(ins[1]);
                    Scanner scanner2 = new Scanner(new BufferedReader(new FileReader("data/choices.txt")));
                    String[] choices = new String[4];
                    for(int j = 0; j < 4; j++){
                        choices[j] = scanner2.nextLine();
                    }
                    multiCard.setAnswerChoices(choices);
                    scanner2 = new Scanner(new BufferedReader(new FileReader("data/answers.txt")));
                    int[] answers = new int[4];
                    String[] answersIns = scanner2.nextLine().split(";");
                    for(int j = 0; j < 4; j++){
                        answers[j] = Integer.parseInt(answersIns[j]);
                    }
                    multiCard.setCorrectAnswer(answers);
//                    scanner2 = new Scanner(new BufferedReader(new FileReader("data/subjects.txt")));
                    cards.add(multiCard);
                }
                else {
                    tfCard = new FlashCardTrueOrFalse();
                    tfCard.setTheQuestion(ins[1]);
//                    cards.add(tfCard);
                }
                i++;
                scanner1.nextLine();
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
