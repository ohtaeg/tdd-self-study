package module;

import money.coin.Coin;

/**
 * 동전 투입구
 * - 이곳을 통해 동전을 넣을 수 있다.
 */
public class CoinSlot {
    private CoinSet coinSet;

    public CoinSlot() {
        this.coinSet = CoinSet.createCoinSet();
    }

    public void insert(final Coin coin) {
        coinSet.add(coin);
    }
}
