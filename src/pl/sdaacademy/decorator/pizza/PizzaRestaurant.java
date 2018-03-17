package pl.sdaacademy.decorator.pizza;

public class PizzaRestaurant {
    public static void main(String[] args) {
        Pizza margherita = new MargheritaPizza();
        margherita.description();

        Pizza americana = new SalamiPizza(margherita);
        americana.description();

        Pizza olivesPizza = new OlivesPizza(americana);
        olivesPizza.description();

        Pizza doubleAmericana = new SalamiPizza(new SalamiPizza(margherita));
        doubleAmericana.description();
    }
}
