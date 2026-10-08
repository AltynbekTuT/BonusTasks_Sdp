public class TopBottomTextMeme implements Meme {
    private String topText;
    private String bottomText;
    private static final int MAX_LENGTH = 30;

    public TopBottomTextMeme(String topText, String bottomText) {
        this.topText = validateAndShrink(topText);
        this.bottomText = validateAndShrink(bottomText);
    }

    private String validateAndShrink(String text) {
        if (text == null) return "";
        if (text.length() > MAX_LENGTH) {
            System.out.println("[Warning] Text too long for bottom text under");
            return text.substring(0,MAX_LENGTH - 3) + "...";
        }
        return text;
    }
    @Override 
    public void generate() {
        System.out.println("Generating [Top-Bottom Meme]:");
        System.out.println("    Top     "  + topText);
        System.out.println("    Bottom      " + bottomText);
        System.out.println("----------------------------");
    }
}
