package coin;

import money.coin.Coin;
import money.coin.KoreaCoins;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CoinTest {

    @DisplayName("[동전 확인] 해당 금액만큼 동전이 생성된다.")
    @ParameterizedTest
    @EnumSource(value = KoreaCoins.class, names = {"TEN_WON", "FIFTY_WON", "ONE_HUNDRED_WON", "FIVE_HUNDRED_WON"})
    void create(KoreaCoins input) {
        // when
        Coin coin = new Coin(input);

        // then
        assertAll("생성된 동전과 파라미터와 일치",
            () -> assertThat(coin.getCoin()).isNotNull(),
            () -> assertThat(coin.getCoin()).isEqualByComparingTo(input)
        );
    }
}