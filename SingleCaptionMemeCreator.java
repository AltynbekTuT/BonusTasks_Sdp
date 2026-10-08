public class SingleCaptionMemeCreator extends MemeCreator {
    @Override
    public Meme createMeme(String... texts) {
        String caption = texts.length > 0 ? texts[0] : "";
        return new SingleCaptionMeme(caption);
    }
}