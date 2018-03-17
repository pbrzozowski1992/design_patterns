package pl.sdaacademy.observer.newsletter;


public interface ShopNewsletter {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void postNewsletter(Newsletter newsletter);
}
