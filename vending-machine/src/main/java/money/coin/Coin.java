package money.coin;

public final class Coin<T extends Enum<KoreaCoinType>> {
    private final T coin;
    public Coin(T coin) {
        this.coin = coin;
    }

    public Coin(int value) {
        this.coin = (T) KoreaCoinType.of(value);
    }

    public T getCoin() {
        return this.coin;
    }
}
