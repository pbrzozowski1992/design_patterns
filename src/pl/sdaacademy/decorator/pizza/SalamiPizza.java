package pl.sdaacademy.decorator.pizza;

public class SalamiPizza extends PizzaDecorator {
    public SalamiPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Dodatkowo: salami");
    }
}
