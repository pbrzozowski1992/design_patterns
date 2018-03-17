package pl.sdaacademy.observer.news_agency;

public interface NewsAgency {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void addNews(News news);
}
