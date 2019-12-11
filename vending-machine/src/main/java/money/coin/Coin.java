package money.coin;

import module.CoinChecker;
import money.Money;

import java.util.Objects;

public final class Coin extends Money {
    private final KoreaCoinType coin;
    private final static CoinChecker COIN_CHECKER = new CoinChecker();

    public Coin(KoreaCoinType coin) {
        this.coin = coin;
    }

    public Coin(int won) {
        this(COIN_CHECKER.check(won));
    }

    @Override
    public Integer getMoney() {
        return coin.getWon();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Coin coin1 = (Coin) o;
        return coin == coin1.coin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coin);
    }
}
