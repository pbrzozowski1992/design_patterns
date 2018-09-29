package pl.sdaacademy.template_method;

public class SoupBar {
    public static void main(String[] args) {
        Soup tomatoSoup = new TomatoSoup();
        Soup mushroomsSoup = new MushroomsSoup();
        System.out.println("Zupa pomidorowa: ");
        tomatoSoup.makeSoup();
        System.out.println("Zupa grzybowa: ");
        mushroomsSoup.makeSoup();
    }
}
