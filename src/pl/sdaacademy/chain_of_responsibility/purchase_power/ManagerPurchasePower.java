package pl.sdaacademy.chain_of_responsibility.purchase_power;

class ManagerPurchasePower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE * 10;
    }

    @Override
    protected String getRole() {
        return "Manager";
    }
}