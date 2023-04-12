package com.helseaCat;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static CardReader cards = new CardReader();
    public static void main(String[] args) {

        ArrayList<BaseFlashCard> ans = cards.getCards();

        if(ans.get(0).getNumberOfChoices() == 4){
            FlashCardMultipleChoice outs = (FlashCardMultipleChoice) ans.get(0);
            String one = outs.getTheQuestion();
            int[] three = outs.getCorrectAnswer();

            System.out.println(one);
            outs.printAnswerChoices();
            System.out.println(Arrays.toString(three));
        }
        else {
            FlashCardTrueOrFalse outs = (FlashCardTrueOrFalse) ans.get(0);
        }

    }
}