package pl.sdaacademy.builder;

public class FerrariCarBuilder extends CarBuilder {

    @Override
    public Car build() {
        return new Car(carName, CarModel.FERRARI, CarType.SPORT);
    }
}
