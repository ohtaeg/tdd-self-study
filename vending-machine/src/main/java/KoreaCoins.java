public enum KoreaCoins {
    TEN_WON(10), FIFTY_WON(50), ONE_HUNDRED_WON(100), FIVE_HUNDRED_WON(500);

    int won;
    KoreaCoins(final int value) {
        this.won = value;
    }

    public int getWon() {
        return won;
    }
}
