package coin;

import java.util.ArrayList;
import java.util.List;

public final class CoinSet {
    private List<KoreaCoins> coinSets;

    private CoinSet(List<KoreaCoins> coinSets) {
        this.coinSets = coinSets;
    }

    public static CoinSet createCoinSet() {
        return new CoinSet(new ArrayList<>());
    }

    public void add(KoreaCoins coin) {
        this.coinSets.add(coin);
    }

    public int getCoins() {
        int money = 0;
        for (KoreaCoins coin : coinSets) {
            money += coin.getWon();
        }
        return money;
    }
}
