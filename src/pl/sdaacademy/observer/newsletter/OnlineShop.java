package pl.sdaacademy.observer.newsletter;

public class OnlineShop {

    public static void main(String[] args) {
        ShopNewsletter shopNewsletter = new MediaMarktNewsletter();
        Subscriber subscriber1 = new MediaMartkVisitor("John Cool");
        Subscriber subscriber2 = new MediaMartkVisitor("Stephen Woolf");
        shopNewsletter.addSubscriber(subscriber1);
        shopNewsletter.addSubscriber(subscriber2);
        shopNewsletter.postNewsletter(new Newsletter("Oferta weekendowa", "20% na wszystko!"));
    }
}
