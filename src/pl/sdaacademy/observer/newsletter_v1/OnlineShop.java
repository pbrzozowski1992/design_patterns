package pl.sdaacademy.observer.newsletter_v1;

public class OnlineShop {
    public static void main(String[] args) {
        Shop shop = new MediaMarkt();
        Subscriber subscriber = new MediaMarktClient();
        Subscriber subscriber1 = new MediaMarktClient();
        shop.addSubscriber(subscriber);
        shop.addSubscriber(subscriber1);
        shop.notifyAboutNewsletter(new Newsletter("nowa gazetka!", "brak opis"));
        shop.removeSubscriber(subscriber1);
        shop.notifyAboutNewsletter(new Newsletter("nowa gazetka2!", "2 wersja!"));
    }
}
