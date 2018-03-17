package pl.sdaacademy.mediator.taxi;

public abstract class Driver {
    protected DriverStatus driverStatus;
    protected Dispatcher dispatcher;

    public Driver(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public abstract void startOrder(String order);
    public abstract void stopOrder();
}
