package pl.sdaacademy.chain_of_responsibility.cash_machine;

public class Withdrawal200 extends Withdrawal {
    @Override
    protected int getAvailableNumberOfNotes() {
        return 10;
    }

    @Override
    protected int getValue() {
        return 200;
    }
}
