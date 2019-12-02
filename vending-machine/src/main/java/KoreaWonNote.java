public enum KoreaWonNote {
    THOUSAND(1000), FIVE_THOUSAND(5000), TEN_THOUSAND(10000), FIFTY_THOUSAND(50000);

    KoreaWonNote(int won) {
        this.won = won;
    }
    private int won;

    public int getWon() {
        return this.won;
    }
}
