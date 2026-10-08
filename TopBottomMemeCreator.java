public class TopBottomMemeCreator extends MemeCreator {
    @Override
    public Meme createMeme(String... texts) {
        String top = texts.length > 0 ? texts[0] : "";
        String bottom = texts.length > 1 ? texts[1] : "";
        return new TopBottomTextMeme(top, bottom);
    }
}