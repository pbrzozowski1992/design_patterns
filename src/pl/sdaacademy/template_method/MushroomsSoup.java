package pl.sdaacademy.template_method;

public class MushroomsSoup  extends Soup{
    @Override
    public void addAdditionalVegetables() {
        System.out.println("Dodajemy grzyby");
    }

    @Override
    public void addCarbohydrates() {
        System.out.println("Dodajemy makaron!");
    }
}
