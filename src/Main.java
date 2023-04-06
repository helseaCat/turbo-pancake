public class Main {
    public static void main(String[] args) {
        BuildSubject current = new BuildSubject();
        Subject2_1 twoOne = new Subject2_1();

        twoOne.build2_1();

        System.out.println("Hello world!");
        System.out.println(twoOne.getCards());
    }
}