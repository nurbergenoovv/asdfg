public class Note extends News{
    private String category;
    public Note() {}
    public Note(String title, String author, String content, String category) {
        super(title, author, content);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
