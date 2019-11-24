public class VendingMachine {
    private int money;

    public int getCurrentMoney() {
        return this.money;
    }

    public void insertCoin(final int coin) {
        this.money += coin;
    }
}
