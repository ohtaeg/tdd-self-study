package money.coin;

import module.CoinChecker;

public final class Coin<T extends Enum<KoreaCoinType>> {
    private final T coin;
    public Coin(T coin) {
        this.coin = coin;
    }

    public Coin(int value) {
        this.coin = (T) CoinChecker.check(value);
    }

    public T getCoin() {
        return this.coin;
    }
}
