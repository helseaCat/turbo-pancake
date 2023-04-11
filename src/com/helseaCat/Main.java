package com.helseaCat;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static CardReader cards = new CardReader();
    public static void main(String[] args) {

        // turn into method somewhere


        ArrayList<BaseFlashCard> ans = cards.getCards();
        FlashCardMultipleChoice outs = (FlashCardMultipleChoice) ans.get(0);
        String one = outs.getTheQuestion();
        String[] two = outs.getAnswerChoices();
        int[] three = outs.getCorrectAnswer();

        System.out.println(ans.get(0).getTheQuestion());
        System.out.println(one + "\n" + Arrays.toString(two) + "\n" + Arrays.toString(three));
    }
}