package pl.sdaacademy.mediator.taxi;

public class SzczecinCity {

    public static void main(String[] args) {
        Dispatcher dispatcher = new TaxiDispatcher();

        Driver taxiDriver1 = new TaxiDriver(dispatcher);
        Driver taxiDriver2 = new TaxiDriver(dispatcher, DriverStatus.DURING_ORDER);
        Driver taxiDriver3 = new TaxiDriver(dispatcher);

        dispatcher.addDriver(taxiDriver1);
        dispatcher.addDriver(taxiDriver2);
        dispatcher.addDriver(taxiDriver3);

        dispatcher.takeOrder("Wały chrobrego - Nowak");

    }
}
