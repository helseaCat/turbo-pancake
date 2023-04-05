
/**
 * Inherits from the FlashCard class while adding the attributes
 * answerChoices and correctAnswer. These attributes are boolean and
 * are specific to a true or false instance of a flash card.
 **/

public class FlashCardTrueOrFalse extends BaseFlashCard{

    private boolean answerChoices;
    private boolean correctAnswer;

    public FlashCardTrueOrFalse(String theQuestion, boolean answerChoices, boolean correctAnswer) {
        setTheQuestion(theQuestion);
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
    }

    public boolean getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(boolean answerChoices) {
        this.answerChoices = answerChoices;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
