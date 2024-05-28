public class Article extends News{
    private String linkPhoto;

    public Article() {
    }

    public Article(String title, String author, String textNews, String linkPhoto) {
        super(title, author, textNews);
        this.linkPhoto = linkPhoto;
    }

    public String getLinkPhoto() {
        return linkPhoto;
    }

    public void setLinkPhoto(String linkPhoto) {
        this.linkPhoto = linkPhoto;
    }
}
