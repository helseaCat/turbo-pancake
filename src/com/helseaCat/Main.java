package com.helseaCat;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static final CardReader cards = new CardReader();
    public static void main(String[] args) {

        ArrayList<BaseFlashCard> ans = cards.getCards();

        //TODO Make these processes a function of their class.
//        int cardToGet = ans.size()-1;
        int cardToGet = 8;

        if(ans.get(cardToGet).getNumberOfChoices() > 2){
            FlashCardMultipleChoice outs = (FlashCardMultipleChoice) ans.get(cardToGet);
            String one = outs.getTheQuestion();
            int[] three = outs.getCorrectAnswer();

            System.out.println(one);
            outs.printAnswerChoices();
            System.out.println(Arrays.toString(three));
        }
        else {
            FlashCardTrueOrFalse outs = (FlashCardTrueOrFalse) ans.get(cardToGet);
            String one = outs.getTheQuestion();
            boolean three = outs.getCorrectAnswer();

            System.out.println(one);
            outs.printAnswerChoices();
            System.out.println(three);
        }
    }
}