package module;

import money.coin.Coin;
import exception.InvalidCoinException;

/**
 * 동전 투입구
 * - 이곳을 통해 동전을 넣을 수 있다.
 */
public class CoinSlot {

    public void insert(final Coin coin) {
        if (!(coin instanceof Coin)) {
            throw new InvalidCoinException();
        }
    }
}
