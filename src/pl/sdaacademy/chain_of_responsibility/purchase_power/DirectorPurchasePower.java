package pl.sdaacademy.chain_of_responsibility.purchase_power;

class DirectorPurchasePower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE * 20;
    }

    @Override
    protected String getRole() {
        return "Director";
    }
}