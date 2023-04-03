
/**
 * Inherits from the FlashCard class while adding the attributes
 * answerChoices and correctAnswer. The attribute answerChoices is
 * an array of Strings and correctAnswer is an array of ints. They
 * both are specific to a multiple-choice instance of a flash card.
 **/

public class FlashCardMultipleChoice extends FlashCard {

    private String[] answerChoices;
    private int[] correctAnswer;

    public FlashCardMultipleChoice(String theQuestion, String[] answerChoices, int[] correctAnswer) {
        setTheQuestion(theQuestion);
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
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
