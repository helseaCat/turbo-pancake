import java.util.ArrayList;

/**
 * Subject2_1 contains all the hard coded data for
 * the subject Computational Thinking. There are 7
 * questions.
 **/

public class Subject2_1 extends BuildSubject{
    private ArrayList questions = new ArrayList();

    public Subject2_1(){

    }


    void build2_1(){
        FlashCardMultipleChoice question = new FlashCardMultipleChoice(
                "Select the 3 choices that represent applying pattern recognition to purchasing supplies.",
                injectChoices("Stanley has painted rooms in the past and will use that experience to paint rooms during this remodel.",
                        "All of the tools Stanley purchases are the same color.",
                        "The technique used to paint the walls will determine which supplies Stanley purchases.",
                        "If the remodel will be extensive, then Stanley can consider investing in a paint sprayer instead of rollers and brushes."),
                injectAnswer(1,0,1,1));
        questions.add(question);
    }

    void build2_2(){
        FlashCardMultipleChoice question = new FlashCardMultipleChoice(
                "Select the 3 choices that represent applying abstraction to purchasing supplies.",
                injectChoices("An irrelevant detail is determining whether the wall is painted from the bottom up or the top down.",
                        "An important detail is renting or buying equipment for painting (paint sprayer, scaffolding, etc)",
                        "An important detail is the amount of time Stanley has to paint as that determines they type of equipment required (paint sprayer or rollers and brushes).",
                        "An important detail is the driving route that Stanley takes to the store."),
                injectAnswer(1,1,1,0));
        questions.add(question);
    }

    void build2_3(){
        FlashCardMultipleChoice question = new FlashCardMultipleChoice(
                "Which of these options places the steps for Computational Thinking in the correct order?",
                injectChoices("1. Abstraction, 2. Decomposition, 3. Pattern Recognition, 4. Algorithm",
                        "1. Abstraction, 2. Pattern Recognition, 3. Decomposition, 4. Algorithm",
                        "1. Decomposition, 2. Pattern Recognition, 3. Abstraction, 4. Algorithm",
                        "1. Decomposition, 2. Abstraction, 3. Algorithm, 4. Pattern Recognition"),
                injectAnswer(0,0,1,0));
        questions.add(question);
    }

    void build2_4(){
        FlashCardMultipleChoice question = new FlashCardMultipleChoice(
                "Which options is the correct definition of Computational Thinking? Select the three correct answers.",
                injectChoices("It allows us to take a complex problem and comprehend what the problem is so we can develop possible solutions.",
                        "It is used while debugging the code.",
                        "Present solutions in a way that a computer, a human, or both, can understand.",
                        "It is the problem-solving process."),
                injectAnswer(1,0,1,1));
        questions.add(question);
    }

    void build2_5(){
        FlashCardMultipleChoice question = new FlashCardMultipleChoice(
                "Which of these steps breaks down a larger problem into smaller problems?",
                injectChoices("Decomposition",
                        "Pattern Recognition",
                        "Algorithm",
                        "Abstraction"),
                injectAnswer(1,0,0,0));
        questions.add(question);
    }

    void build2_6(){
        FlashCardMultipleChoice question = new FlashCardMultipleChoice(
                "Which option defines Abstraction?",
                injectChoices("Design simple steps to solve a problem.",
                        "Recognize similarities between two different problems and experiences.",
                        "Represents important details while ignoring irrelevant details.",
                        "Breakdown of larger problems into smaller problems."),
                injectAnswer(0,0,1,0));
        questions.add(question);
    }

    void build2_7(){
        FlashCardMultipleChoice question = new FlashCardMultipleChoice(
                "Which option defines algorithm?",
                injectChoices("Represents important details while ignoring irrelevant details.",
                        "Breakdown of larger problems into smaller problems.",
                        "Design simple steps to solve a problem.",
                        "Recognize similarities between two different problems and experiences."),
                injectAnswer(0,0,1,0));
        questions.add(question);
    }

    // Getter for question attributes.
    public ArrayList getCards(){
        return questions;
    }

    public Object getCard(int question){
        return questions.get(question);
    }

}
