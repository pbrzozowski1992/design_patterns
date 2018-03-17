package pl.sdaacademy.observer.newsletter_v1;

import java.util.ArrayList;
import java.util.List;

public class MediaMarkt implements Shop {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAboutNewsletter(Newsletter newsletter) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notifyAboutLatestNewsletter(newsletter);
        }
    }
}
