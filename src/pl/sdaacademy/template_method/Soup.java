package pl.sdaacademy.template_method;

public abstract class Soup {

    public final void makeSoup() {
        makeChickenSoup();
        addAdditionalVegetables();
        addCarbohydrates();
    }

    private void makeChickenSoup() {
        System.out.println("Gotujemy rosołek!");
    }

    public abstract void addAdditionalVegetables();

    public abstract void addCarbohydrates();
}
