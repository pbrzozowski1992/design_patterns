package pl.sdaacademy.chain_of_responsibility.purchase_power;

class PresidentPurchasePower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE * 60;
    }

    @Override
    protected String getRole() {
        return "Vice President";
    }
}