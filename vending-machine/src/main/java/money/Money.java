package money;

/**
 * 불변 객체
 */
public final class Money {
    private final int money;
    private Money(final int money) {
        this.money = money;
    }

    public static Money of(final int money) {
        return new Money(money);
    }
}
