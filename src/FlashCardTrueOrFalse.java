
/**
 * Inherits from the FlashCard class while adding the attributes
 * answerChoices and correctAnswer. These attributes are boolean and
 * are specific to a true or false instance of a flash card.
 **/

public class FlashCardTrueOrFalse extends BaseFlashCard{

    private String[] answerChoices = {"True", "False"};
    private boolean correctAnswer;

    public FlashCardTrueOrFalse(String theQuestion, boolean correctAnswer) {
        setTheQuestion(theQuestion);
        this.correctAnswer = correctAnswer;
    }

    public String[] getAnswerChoices() {
        return answerChoices;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }
}