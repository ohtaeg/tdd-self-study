public class VendingMachine {
    private int money;

    public int getCurrentMoney() {
        return this.money;
    }

    // TODO : 동전 금액이 유효하지 않으면 exception 발생하도록 수정할 것.
    public void insertCoin(final int coin) {
        if (isCorrect(coin)) {
            this.money += coin;
        }
    }

    // TODO : 인덴트 2칸, 1칸으로 refactoring 필요.
    public boolean isCorrect(final int value) {
        for (int i=0; i<KoreaCoinUnit.values().length; i++) {
            if (KoreaCoinUnit.values()[i].getWon() == value) {
                return true;
            }
        }
        return false;
    }
}
