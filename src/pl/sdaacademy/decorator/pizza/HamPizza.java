package pl.sdaacademy.decorator.pizza;

public class HamPizza extends PizzaDecorator {
    public HamPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Dodatkowo: szynka");
    }
}
