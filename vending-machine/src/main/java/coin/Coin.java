package coin;

public final class Coin<T extends Enum<KoreaCoins>> {
    private final T coin;
    public Coin(T coin) {
        this.coin = coin;
    }

    public T getCoin() {
        return this.coin;
    }
}
