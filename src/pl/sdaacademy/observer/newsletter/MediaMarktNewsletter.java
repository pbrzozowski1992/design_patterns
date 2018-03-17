package pl.sdaacademy.observer.newsletter;

import java.util.ArrayList;
import java.util.List;

public class MediaMarktNewsletter implements ShopNewsletter {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void postNewsletter(Newsletter newsletter) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notifyAboutLatestOffer(newsletter);
        }
    }
}
