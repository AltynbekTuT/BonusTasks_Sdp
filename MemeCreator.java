public abstract class MemeCreator {
    public abstract Meme createMeme(String... texts);

    public void assembleMeme(String... texts) {
        Meme meme = createMeme(texts);
        meme.generate();
    }
}