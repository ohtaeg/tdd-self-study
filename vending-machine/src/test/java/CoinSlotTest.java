
import module.CoinSlot;
import money.coin.Coin;
import money.coin.KoreaCoins;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

class CoinSlotTest {
    private CoinSlot coinSlot;
    private Coin coin;

    @BeforeEach
    public void setup() {
        coinSlot = new CoinSlot();
        coin = new Coin(KoreaCoins.FIFTY_WON);
    }

    @DisplayName("동전 투입을 할 수 있다.")
    @Test
    void insert() {
        // given
        CoinSlot mockCoinSlot = mock(CoinSlot.class);

        // when
        mockCoinSlot.insert(coin);

        // then
        then(mockCoinSlot).should().insert(coin);
    }
}