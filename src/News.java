public class News {
    private String title;
    private String author;
    private String textNews;
    public News(){}
    public News(String title, String author, String textNews) {
        this.title = title;
        this.author = author;
        this.textNews = textNews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTextNews() {
        return textNews;
    }

    public void setTextNews(String textNews) {
        this.textNews = textNews;
    }
}
