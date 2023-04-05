
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
//    private String[] answerChoices = new String[4];
//    private int userGivenAnswer;
//    private int correctAnswer;

//    // Setter for the answer the user input.
//    public void setUserGivenAnswer(int userGivenAnswer){
//        this.userGivenAnswer = userGivenAnswer;
//    }
//
//    // Getter for the answer the user input.
//    public int getUserGivenAnswer(){
//        return userGivenAnswer;
//    }

    // Getter for the question asked on the card.
    public String getTheQuestion(){
        return theQuestion;
    }

    // Setter for the question asked on the card.
    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    //    // Getter for the array of string values that makes up the multiple choices.
//    public String[] getAnswerChoices(){
//        return answerChoices;
//    }

//    // Getter for the actual correct answer to the card.
//    public int getCorrectAnswer(){
//        return correctAnswer;
//    }

}
