
/**
 * BuildSubjects2to5 hard codes subjects 2, 3, 4, and 5 from the ATA canvas
 * workflow. Maybe importing custom card data will be possible in
 * future implementations
 **/
public class BuildSubject {
    void buildCards2to5(){
        // Cards For 2.1 Computational Thinking
        Subject2_1 twoOne = new Subject2_1();
        twoOne.build2_1();
        twoOne.build2_2();
        twoOne.build2_3();
        twoOne.build2_4();
        twoOne.build2_5();
        twoOne.build2_6();
        twoOne.build2_7();
    }

    String[] injectChoices(String questionOne, String questionTwo, String questionThree, String questionFour){
        String[] answerChoices = new String[4];
        answerChoices[0] = questionOne;
        answerChoices[1] = questionTwo;
        answerChoices[2] = questionThree;
        answerChoices[3] = questionFour;
        return answerChoices;
    }

    int[] injectAnswer(int answerOne, int answerTwo, int answerThree, int answerFour){
        int[] correctAnswer = new int[4];
        correctAnswer[0] = answerOne;
        correctAnswer[1] = answerTwo;
        correctAnswer[2] = answerThree;
        correctAnswer[3] = answerFour;
        return correctAnswer;
    }

}

