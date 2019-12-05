import money.coin.CoinSet;
import money.coin.KoreaCoins;
import money.wonnote.KoreaWonNote;
import money.wonnote.WonNoteSet;

public class VendingMachine {
    private CoinSet coinSet;
    private WonNoteSet wonNoteSet;

    public VendingMachine() {
        this.coinSet = CoinSet.createCoinSet();
        this.wonNoteSet = WonNoteSet.createWonNoteSet();
    }

    public void insertCoin(final KoreaCoins coin) {
        if (isKoreaCoins(coin)) {
            coinSet.add(coin);
        }
    }

    public void insertWonNote(final KoreaWonNote wonNote) {
        if (isKoreaWonNote(wonNote)) {
            wonNoteSet.add(wonNote);
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

    public int getCurrentMoney() {
        return getCoinSet();
    }

    public int getCoinSet() {
        return coinSet.getCoins();
    }

    public int getWonNoteSet() {
        return wonNoteSet.getWonNotes();
    }
}
