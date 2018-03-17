package pl.sdaacademy.decorator.pizza;

public class OlivesPizza extends PizzaDecorator {
    public OlivesPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Dodatkowo oliwki");
    }
}
