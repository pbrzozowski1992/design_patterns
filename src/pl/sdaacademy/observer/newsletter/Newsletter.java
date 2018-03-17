package pl.sdaacademy.observer.newsletter;

public class Newsletter {
    public String title;
    public String description;

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
