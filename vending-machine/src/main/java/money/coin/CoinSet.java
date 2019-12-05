package money.coin;

import java.util.ArrayList;
import java.util.List;

public final class CoinSet {
    private List<KoreaCoinType> coinSets;

    private CoinSet(List<KoreaCoinType> coinSets) {
        this.coinSets = coinSets;
    }

    public static CoinSet createCoinSet() {
        return new CoinSet(new ArrayList<>());
    }

    public void add(KoreaCoinType coin) {
        this.coinSets.add(coin);
    }
}
