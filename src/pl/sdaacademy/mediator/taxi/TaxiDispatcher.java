package pl.sdaacademy.mediator.taxi;

import java.util.ArrayList;
import java.util.List;

public class TaxiDispatcher implements Dispatcher {

    private List<Driver> drivers;

    public TaxiDispatcher(){
        this.drivers = new ArrayList<>();
    }

    @Override
    public void takeOrder(String order) {
        System.out.println("Take order: " + order + " -> accept");
        sendOrder(order);
    }

    @Override
    public void sendOrder(String order) {
        for (Driver driver : drivers) {
            if (driver.driverStatus == DriverStatus.WAITING_FOR_ORDER){
                driver.startOrder(order);
                return;
            }
        }
    }

    @Override
    public void updateDriverStatus(Driver driver) {
        System.out.println("Update driver status: " + driver);
    }

    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
}
