package pl.sdaacademy.chain_of_responsibility.purchase_power;

public class Company {

    public static void main(String[] args) {
        PurchaseRequest purchaseRequest =
                new PurchaseRequest(5000,
                        "Nowy notebook dla pracownika");
        ManagerPurchasePower manager = new ManagerPurchasePower();
        DirectorPurchasePower director = new DirectorPurchasePower();
        VicePresidentPurchasePower vicePresident = new VicePresidentPurchasePower();
        PresidentPurchasePower president = new PresidentPurchasePower();
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        manager.processRequest(purchaseRequest);
    }
}
