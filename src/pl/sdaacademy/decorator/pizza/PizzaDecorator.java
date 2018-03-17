package pl.sdaacademy.decorator.pizza;

public class PizzaDecorator extends Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void description() {
        pizza.description();
    }
}
