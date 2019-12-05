import money.coin.CoinSet;
import money.wonnote.WonNoteSet;

public class VendingMachine {
    private CoinSet coinSet;
    private WonNoteSet wonNoteSet;

    public VendingMachine() {
        this.coinSet = CoinSet.createCoinSet();
        this.wonNoteSet = WonNoteSet.createWonNoteSet();
    }
}
