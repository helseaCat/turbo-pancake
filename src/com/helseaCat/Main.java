package com.helseaCat;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static CardReader cards = new CardReader();
    public static void main(String[] args) {

        ArrayList<BaseFlashCard> ans = cards.getCards();
        FlashCardMultipleChoice outs = (FlashCardMultipleChoice) ans.get(0);
        String one = outs.getTheQuestion();
        String[] two = outs.getAnswerChoices();
        int[] three = outs.getCorrectAnswer();

        System.out.println(one + "\n" + Arrays.toString(two) + "\n" + Arrays.toString(three));
    }
}