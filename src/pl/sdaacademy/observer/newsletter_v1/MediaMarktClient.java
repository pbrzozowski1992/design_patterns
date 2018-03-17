package pl.sdaacademy.observer.newsletter_v1;

public class MediaMarktClient implements Subscriber {

    @Override
    public void notifyAboutLatestNewsletter(Newsletter newsletter) {
        System.out.println("Otrzymano newsleeter: " + newsletter);
    }
}
