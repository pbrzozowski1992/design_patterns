package pl.sdaacademy.decorator.pizza;

public class MargheritaPizza extends Pizza {
    @Override
    public void description() {
        System.out.println("Ta pizza składa się z sosu pomidorowego i sera");
    }
}
