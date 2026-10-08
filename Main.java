public class Main {
    public static void main(String[] args) {
        MemeCreator topBottomCreator = new TopBottomMemeCreator();
        topBottomCreator.assembleMeme("When code compiles on the first try", "And you have no idea why");

        topBottomCreator.assembleMeme("This is an extremely long top text that definitely exceeds the maximum allowed character limit for this format", "Short bottom");

        MemeCreator singleCreator = new SingleCaptionMemeCreator();
        singleCreator.assembleMeme("That moment when tests pass");
    }
}