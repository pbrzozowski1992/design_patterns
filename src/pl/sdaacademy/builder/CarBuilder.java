package pl.sdaacademy.builder;

public abstract class CarBuilder {
    protected String carName;

    public CarBuilder setCarName(String carName){
        this.carName = carName;
        return this;
    }
    public abstract Car build();
}
