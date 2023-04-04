
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
        build2_1();
        build2_2();
        build2_3();
        build2_4();
        build2_5();
        build2_6();
        build2_7();
    }

    void build2_1(){
        injectChoices("Stanley has painted rooms in the past and will use that experience to paint rooms during this remodel.",
                "All of the tools Stanley purchases are the same color.",
                "The technique used to paint the walls will determine which supplies Stanley purchases.",
                "If the remodel will be extensive, then Stanley can consider investing in a paint sprayer instead of rollers and brushes.");
        injectAnswer(1,0,1,1);
        FlashCardMultipleChoice question1 = new FlashCardMultipleChoice(
                "Select the 3 choices that represent applying pattern recognition to purchasing supplies.",
                answerChoices,
                correctAnswer);
    }

    void build2_2(){
         injectChoices("An irrelevant detail is determining whether the wall is painted from the bottom up or the top down.",
                 "An important detail is renting or buying equipment for painting (paint sprayer, scaffolding, etc)",
                 "An important detail is the amount of time Stanley has to paint as that determines they type of equipment required (paint sprayer or rollers and brushes).",
                 "An important detail is the driving route that Stanley takes to the store.");
         injectAnswer(1,1,1,0);
         FlashCardMultipleChoice question2 = new FlashCardMultipleChoice(
                 "Select the 3 choices that represent applying abstraction to purchasing supplies.",
                 answerChoices,
                 correctAnswer);
     }

    void build2_3(){
        injectChoices("1. Abstraction, 2. Decomposition, 3. Pattern Recognition, 4. Algorithm",
                "1. Abstraction, 2. Pattern Recognition, 3. Decomposition, 4. Algorithm",
                "1. Decomposition, 2. Pattern Recognition, 3. Abstraction, 4. Algorithm",
                "1. Decomposition, 2. Abstraction, 3. Algorithm, 4. Pattern Recognition");
        injectAnswer(0,0,1,0);
        FlashCardMultipleChoice question3 = new FlashCardMultipleChoice(
                "Which of these options places the steps for Computational Thinking in the correct order?",
                answerChoices,
                correctAnswer);
    }

    void build2_4(){
        injectChoices("It allows us to take a complex problem and comprehend what the problem is so we can develop possible solutions.",
                "It is used while debugging the code.",
                "Present solutions in a way that a computer, a human, or both, can understand.",
                "It is the problem-solving process.");
        injectAnswer(1,0,1,1);
        FlashCardMultipleChoice question4 = new FlashCardMultipleChoice(
                "Which options is the correct definition of Computational Thinking? Select the three correct answers.",
                answerChoices,
                correctAnswer);
    }

    void build2_5(){
        injectChoices("Decomposition",
                "Pattern Recognition",
                "Algorithm",
                "Abstraction");
        injectAnswer(1,0,0,0);
        FlashCardMultipleChoice question5 = new FlashCardMultipleChoice(
                "Which of these steps breaks down a larger problem into smaller problems?",
                answerChoices,
                correctAnswer);
    }

    void build2_6(){
        injectChoices("Design simple steps to solve a problem.",
                "Recognize similarities between two different problems and experiences.",
                "Represents important details while ignoring irrelevant details.",
                "Breakdown of larger problems into smaller problems.");
        injectAnswer(0,0,1,0);
        FlashCardMultipleChoice question6 = new FlashCardMultipleChoice(
                "Which option defines Abstraction?",
                answerChoices,
                correctAnswer);
    }

    void build2_7(){
        injectChoices("Represents important details while ignoring irrelevant details.",
                "Breakdown of larger problems into smaller problems.",
                "Design simple steps to solve a problem.",
                "Recognize similarities between two different problems and experiences.");
        injectAnswer(0,0,1,0);
        FlashCardMultipleChoice question7 = new FlashCardMultipleChoice(
                "Which option defines algorithm?",
                answerChoices,
                correctAnswer);
    }

    // Getter for question attributes.
    public FlashCardMultipleChoice getCard(){
        return question1;
    }
}

