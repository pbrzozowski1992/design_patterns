package pl.sdaacademy.chain_of_responsibility.cash_machine;

public class Withdrawal50 extends Withdrawal {
    @Override
    protected int getAvailableNumberOfNotes() {
        return 50;
    }

    @Override
    protected int getValue() {
        return 50;
    }
}
