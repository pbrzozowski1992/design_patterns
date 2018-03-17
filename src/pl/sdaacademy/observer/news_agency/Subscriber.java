package pl.sdaacademy.observer.news_agency;

public interface Subscriber {

    void notifyAboutLatestNews(String agencyName, News news);
}
