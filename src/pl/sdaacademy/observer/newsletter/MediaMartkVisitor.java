package pl.sdaacademy.observer.newsletter;

public class MediaMartkVisitor implements Subscriber {
    private String name;

    public MediaMartkVisitor(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutLatestOffer(Newsletter news) {
        System.out.println(name + "-> nowy newsletter: " + news);
    }
}
