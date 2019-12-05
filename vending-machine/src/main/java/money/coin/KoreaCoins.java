package money.coin;

import exception.InvalidCoinException;
import money.Money;

import java.util.Arrays;

public enum KoreaCoins {
    TEN_WON(Money.of(10), 10)
    , FIFTY_WON(Money.of(50), 50)
    , ONE_HUNDRED_WON(Money.of(100), 100)
    , FIVE_HUNDRED_WON(Money.of(500), 500);

    private Money money;
    private int won;
    KoreaCoins(final Money money, final int won) {
        this.money = money;
        this.won = won;
    }

    public int getWon() {
        return won;
    }

    static KoreaCoins of(int won) {
        return Arrays.stream(values())
                     .filter(coin -> coin.getWon() == won)
                     .findFirst()
                     .orElseThrow(() -> new InvalidCoinException());
    }
}
