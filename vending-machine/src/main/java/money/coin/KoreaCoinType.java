package money.coin;

public enum KoreaCoinType {
    TEN_WON(10)
    , FIFTY_WON(50)
    , ONE_HUNDRED_WON(100)
    , FIVE_HUNDRED_WON(500);

    private int won;

    KoreaCoinType(final int won) {
        this.won = won;
    }

    public int getWon() {
        return won;
    }
}
