package module;

import money.coin.Coin;

import java.util.ArrayList;
import java.util.List;


/**
 * 동전 통
 */
//TODO : 불변객체로 만들어야 할까?
public final class CoinSet {
    private final List<Coin> coinSets;

    private CoinSet(List<Coin> coinSets) {
        this.coinSets = coinSets;
    }

    public static CoinSet createCoinSet() {
        return new CoinSet(new ArrayList<>());
    }

    public void add(Coin coin) {
        this.coinSets.add(coin);
    }
}
