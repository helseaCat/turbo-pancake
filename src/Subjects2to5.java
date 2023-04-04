public class Subjects2to5 {

    String[] answerChoices = new String[4];
    int[] correctAnswer;

    void injectChoices(String one, String two, String three, String four){
        answerChoices[0] = one;
        answerChoices[1] = two;
        answerChoices[2] = three;
        answerChoices[3] = four;
    }

    public void buildCards(){
        // Cards For 2.1 Computational Thinking
        injectChoices("Stanley has painted rooms in the past and will use that experience to paint rooms during this remodel.",
                "All of the tools Stanley purchases are the same color.",
                "The technique used to paint the walls will determine which supplies Stanley purchases.",
                "If the remodel will be extensive, then Stanley can consider investing in a paint sprayer instead of rollers and brushes.");
        FlashCardMultipleChoice question1 = new FlashCardMultipleChoice(
                "Select the 3 choices that represent applying pattern recognition to purchasing supplies.",
                answerChoices,
                correctAnswer);
    }


}
