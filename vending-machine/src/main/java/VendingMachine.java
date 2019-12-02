public class VendingMachine {
    // TODO : 일급객체로 변환할 것.
    private int money;

    public int getCurrentMoney() {
        return this.money;
    }

    public void insertCoin(final KoreaCoins coin) {
        if (isKoreaCoinUnit(coin)) {
            this.money += coin.getWon();
        }
    }

    public void insertWonNote(final KoreaWonNote wonNote) {
        if (isKoreaWonNote(wonNote)) {
            this.money += wonNote.getWon();
        }
    }

    // TODO : 인덴트 1칸으로 refactoring 필요.
    public boolean isKoreaCoinUnit(final KoreaCoins coin) {
        if (coin instanceof KoreaCoins) {
            int won = coin.getWon();
            for (KoreaCoins coinUnit : KoreaCoins.values()) {
                if (coinUnit.getWon() == won) {
                    return true;
                }
            }
        }

        return false;
    }

    // TODO : 인덴트 1칸으로 refactoring 필요.
    public boolean isKoreaWonNote(final KoreaWonNote bill) {
        if (bill instanceof KoreaWonNote) {
            int won = bill.getWon();
            for (KoreaWonNote wonNote : KoreaWonNote.values()) {
                if (wonNote.getWon() == bill.getWon()) {
                    return true;
                }
            }
        }
        return false;
    }
}
