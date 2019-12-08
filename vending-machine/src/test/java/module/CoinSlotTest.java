package module;

import money.coin.Coin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CoinSlotTest {

    private CoinSlot coinSlot;

    @BeforeEach
    void setUp() {
        coinSlot = new CoinSlot();
    }

    @DisplayName("[동전 투입] 동전 투입이 가능하다.")
    @Test
    void insert() {
        // given
        CoinSlot mock = mock(CoinSlot.class);
        Coin coin = new Coin(10);

        // when
        mock.insert(coin);

        // then
        verify(mock, atLeastOnce()).insert(coin);
    }
}