package money.coin;

public final class Coin<T extends Enum<KoreaCoins>> {
    private final T coin;
    public Coin(T coin) {
        this.coin = coin;
    }

    public Coin(int value) {
        this.coin = (T) KoreaCoins.of(value);
    }

    public T getCoin() {
        return this.coin;
    }
}
