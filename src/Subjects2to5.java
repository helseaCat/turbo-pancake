
/**
 * Subjects2to5 hard codes subjects 2, 3, 4, and 5 from the ATA canvas
 * workflow. Maybe importing custom card data will be possible in
 * future implementations
 **/
public class Subjects2to5 {

    String[] answerChoices = new String[4];
    int[] correctAnswer = new int[4];
    void injectChoices(String one, String two, String three, String four){
        answerChoices[0] = one;
        answerChoices[1] = two;
        answerChoices[2] = three;
        answerChoices[3] = four;
    }

    void injectAnswer(int one, int two, int three, int four){
        correctAnswer[0] = one;
        correctAnswer[1] = two;
        correctAnswer[2] = three;
        correctAnswer[3] = four;
    }

    void buildCards(){
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

}

