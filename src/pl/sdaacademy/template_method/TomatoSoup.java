package pl.sdaacademy.template_method;

public class TomatoSoup extends Soup {
    @Override
    public void addAdditionalVegetables() {
        System.out.println("Dodajemy pomidory!");
    }

    @Override
    public void addCarbohydrates() {
        System.out.println("Dodajemy zacierki!");
    }
}
