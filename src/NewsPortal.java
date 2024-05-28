import java.util.*;

public class NewsPortal {
    private List<News> items;

    public NewsPortal() {
        items = new ArrayList<>();
    }

    public void addNews(News news) {
        items.add(news);
    }

    public News searchByTitle(String title) {
        return items.stream().filter(news -> news.getTitle().equals(title)).findFirst().orElseThrow(null);
    }

    public boolean removeNewsByTitle(String title) {
        try {
            return items.removeIf(news -> news.getTitle().equals(title));
        } catch (Exception e) {
            return false;
        }
    }

    public int countByAuthor(String author) {
        return ((int) items.stream().filter(item -> item.getAuthor().equals(author)).count());
    }

    public void removeDublicats() {
        Set<String> newsTitle = new HashSet<>();
        items.removeIf(item -> !newsTitle.add(item.getTitle()));
    }

}
