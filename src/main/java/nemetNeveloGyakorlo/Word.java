package nemetNeveloGyakorlo;

public class Word {
    private final String article;
    private final String germanWord;
    private final String hunWord;

    public Word(String article, String germanWord, String hunWord) {
        this.article = article;
        this.germanWord = germanWord;
        this.hunWord = hunWord;
    }

    public String getArticle() {
        return article;
    }

    public String getGermanWord() {
        return germanWord;
    }

    public String getHunWord() {
        return hunWord;
    }

}
