public enum KoreaCoinUnit {
    TEN_WON(10), FIFTY_WON(50), ONE_HUNDRED_WON(100), FIVE_HUNDRED_WON(500);

    int won;
    KoreaCoinUnit(final int value) {
        this.won = value;
    }

    public int getWon() {
        return won;
    }
}
