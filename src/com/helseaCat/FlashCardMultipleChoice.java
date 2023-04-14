package com.helseaCat;

/**
 * Inherits from the FlashCard class while adding the attributes
 * answerChoices and correctAnswer. The attribute answerChoices is
 * an array of Strings and correctAnswer is an array of ints. They
 * both are specific to a multiple-choice instance of a flash card.
 * (Yet to implement) The answer could also be submitted in an integer form.
 * ex
 * if the answer is [0,1,0,1] -> int 101
 * if the answer is [0,0,0,1] -> int 1
 * if the answer is [1,0,0,0] - > int 1000
 **/

public class FlashCardMultipleChoice extends BaseFlashCard {

    private String[] answerChoices;
    private int[] correctAnswer;

    public void printAnswerChoices(){
        System.out.println();
        for(String answerChoice : answerChoices){
            System.out.println("\u2022" + answerChoice);
        }
        System.out.println();
    }

    public String[] getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
    }

    public int[] getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int[] correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
