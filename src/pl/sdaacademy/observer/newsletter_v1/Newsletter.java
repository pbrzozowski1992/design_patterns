package pl.sdaacademy.observer.newsletter_v1;

public class Newsletter {
    private String title;
    private String description;

    public Newsletter(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Newsletter{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
