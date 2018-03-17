package pl.sdaacademy.chain_of_responsibility.cash_machine;

public class Withdrawal100 extends Withdrawal {
    @Override
    protected int getAvailableNumberOfNotes() {
        return 2;
    }

    @Override
    protected int getValue() {
        return 100;
    }
}
