package pl.sdaacademy.mediator.taxi;

public class TaxiDriver extends Driver{

    public TaxiDriver(Dispatcher dispatcher) {
        super(dispatcher);
        driverStatus = DriverStatus.WAITING_FOR_ORDER;
    }

    public TaxiDriver(Dispatcher dispatcher, DriverStatus driverStatus) {
        super(dispatcher);
        this.driverStatus = driverStatus;
    }

    @Override
    public void startOrder(String order) {
        driverStatus = DriverStatus.DURING_ORDER;
        System.out.println("Zaczynam zamówienie: " + order);
    }

    @Override
    public void stopOrder() {
        driverStatus = DriverStatus.WAITING_FOR_ORDER;
        dispatcher.updateDriverStatus(this);
    }
}
