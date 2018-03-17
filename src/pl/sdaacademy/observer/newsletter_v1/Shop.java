package pl.sdaacademy.observer.newsletter_v1;

public interface Shop {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifyAboutNewsletter(Newsletter newsletter);
}
