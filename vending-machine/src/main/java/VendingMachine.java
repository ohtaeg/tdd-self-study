import module.CoinSet;
import module.CoinSlot;
import money.coin.Coin;
import view.Screen;

public class VendingMachine {
    private CoinSlot coinSlot;
    private CoinSet coinSet;
    private Screen screen;

    public VendingMachine() {
        coinSlot = new CoinSlot();
        screen = new Screen();
    }

    public void insert(Coin coin) {
        coinSlot.insert(coin);
        screen.display();
    }
}
