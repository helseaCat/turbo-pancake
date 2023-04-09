import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BuildSubject current = new BuildSubject();
        Subject2_1 twoOne = new Subject2_1();

        twoOne.build2_1();

        // turn into method somewhere
        FlashCardMultipleChoice flash;
        ArrayList ans = twoOne.getCards();
        flash = (FlashCardMultipleChoice) ans.get(0);


        System.out.println("\n\n");
        System.out.println(flash.getTheQuestion() + "\n");

        // turn into print method somewhere
        String[] arr = flash.getAnswerChoices();
        for(int i = 0; i < 4; i++){
            System.out.println((i+1) + ") " + arr[i]);
        }

        System.out.println("\n\n");
    }
}