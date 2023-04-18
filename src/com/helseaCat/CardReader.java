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
        int numberOfChoices;
        String theQuestion;
        try {
            Scanner scanner1 = new Scanner(new BufferedReader(new FileReader("data/questions.txt")));
            Scanner scanner2 = new Scanner(new BufferedReader(new FileReader("data/choices.txt")));
            Scanner scanner3 = new Scanner(new BufferedReader(new FileReader("data/answers.txt")));
            String[] question = getValidScannerInput(scanner1);

            while(scanner1.hasNextLine()){
                numberOfChoices = Integer.parseInt(question[0]);
                theQuestion = question[1];
                if (numberOfChoices > 2) {
                    multiCard = new FlashCardMultipleChoice();
                    multiCard.setNumberOfChoices(numberOfChoices);
                    multiCard.setTheQuestion(theQuestion);
                    String[] choices = new String[numberOfChoices];
                    for(int i = 0; i < numberOfChoices; i++) {
                        choices[i] = getValidScannerInput(scanner2)[0];
                    }
                    multiCard.setAnswerChoices(choices);
                    int[] answers = new int[numberOfChoices];
                    String[] answersIns = getValidScannerInput(scanner3);
                    for(int i = 0; i < numberOfChoices; i++) {
                        answers[i] = Integer.parseInt(answersIns[i]);
                    }
                    multiCard.setCorrectAnswer(answers);
                    cards.add(multiCard);
                }
                else {
                    numberOfChoices = Integer.parseInt(question[0]);
                    theQuestion = question[1];
                    tfCard = new FlashCardTrueOrFalse();
                    tfCard.setNumberOfChoices(numberOfChoices);
                    tfCard.setTheQuestion(theQuestion);
                    String[] answersIns = scanner3.nextLine().split(";");
                    tfCard.setCorrectAnswer(answersIns[0].equals("1"));
                    cards.add(tfCard);
                }
//                question = scanner1.nextLine().split(";");
                question = getValidScannerInput(scanner1);
            }
        }
        catch (IOException e) {
            e.getStackTrace();
        }
    }

    /**
     * Checks scanner for a String of "###" and skips to next line if found. Does not check if
     * at the end of the data file. Also does not check if a "###" line is followed by another
     * "###".
     **/
    private static String[] getValidScannerInput(Scanner scanner){
        //TODO Make into actual get process.
        String[] outs;
        String ins = scanner.nextLine();
        if(ins.length() >= 3 && ins.charAt(0) == '#'
                            && ins.charAt(1) == '#'
                            && ins.charAt(2) == '#'){
            outs = scanner.nextLine().split(";");
            return outs;
        }
        outs = ins.split(";");
        return outs;
    }

    public ArrayList<BaseFlashCard> getCards() {
        return cards;
    }
}
