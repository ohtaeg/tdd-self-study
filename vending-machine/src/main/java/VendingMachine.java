public class VendingMachine {
    // TODO : 일급객체로 변환할 것.
    private int money;

    public int getCurrentMoney() {
        return this.money;
    }

    public void insertCoin(final KoreaCoins coin) {
        if (isKoreaCoins(coin)) {
            this.money += coin.getWon();
        }
    }

    public void insertWonNote(final KoreaWonNote wonNote) {
        if (isKoreaWonNote(wonNote)) {
            this.money += wonNote.getWon();
        }
    }

    public boolean isKoreaCoins(final KoreaCoins coin) {
        if (!(coin instanceof KoreaCoins)) {
            throw new IllegalArgumentException("잘못된 동전입니다.");
        }
        return true;
    }

    public boolean isKoreaWonNote(final KoreaWonNote bill) {
        if (!(bill instanceof KoreaWonNote)) {
            throw new IllegalArgumentException("잘못된 지폐입니다.");
        }
        return true;
    }
}
