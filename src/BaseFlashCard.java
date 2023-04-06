
/**
 * flash cards are designed strictly with Amazon Technical Academy in mind.
 * They consist of a few things including the ability to pick an answer from
 * a list of 4 choices. Occasionally there will be multiple answers within
 * one question. The flash cards should be grouped based on the ATA prereqs
 * material.
 * Upon further realization, answerChoices and correctAnswer should be decided in the inheriting
 * classes 'multi' and 'true or false'.
 **/

public class BaseFlashCard {
    private String theQuestion;

    // Getter for the question asked on the card.


    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public String getTheQuestion(){
        return theQuestion;
    }
}
