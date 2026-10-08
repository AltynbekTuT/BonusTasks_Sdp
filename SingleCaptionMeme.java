public class SingleCaptionMeme implements Meme {
    private String caption;
    private static final int MAX_LENGTH = 50;

    public SingleCaptionMeme(String caption) {
        if (caption != null && caption.length() > MAX_LENGTH) {
            this.caption = caption.substring(0, MAX_LENGTH - 3) + "...";
            System.out.println("[Warning] Caption shrunk to fit single-caption layout.");
        } else {
            this.caption = caption != null ? caption : "";
        }
    }

    @Override
    public void generate() {
        System.out.println("Generating [Single Caption Meme]:");
        System.out.println("  CAPTION: " + caption);
        System.out.println("-----------------------------------");
    }
}