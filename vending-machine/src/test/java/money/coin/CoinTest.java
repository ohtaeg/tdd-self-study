package money.coin;

import exception.InvalidCoinException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CoinTest {

    @DisplayName("[동전 확인] 한국 동전의 금액만큼 동전이 생성된다.")
    @ParameterizedTest
    @EnumSource(value = KoreaCoins.class, names = {"TEN_WON", "FIFTY_WON", "ONE_HUNDRED_WON", "FIVE_HUNDRED_WON"})
    void createCoin(KoreaCoins input) {
        // when
        Coin coin = new Coin(input);

        // then
        assertAll("생성된 동전과 파라미터와 일치",
            () -> assertThat(coin.getCoin()).isNotNull(),
            () -> assertThat(coin.getCoin()).isEqualTo(input)
        );
    }

    @DisplayName("[동전 확인2] 한국동전이 아닌 정수를 파라미터로 해당 금액만큼 동전이 생성된다.")
    @Test
    void createIntegerCoin() {
        // when
        Coin coin = new Coin(10);

        // then
        assertAll("생성된 동전과 파라미터와 일치",
                () -> assertThat(coin.getCoin()).isNotNull(),
                () -> assertThat(coin.getCoin()).isEqualTo(KoreaCoins.of(10))
        );
    }

    @DisplayName("[동전 확인3] 한국 동전에 맞지 않는 금액을 던지면 예외를 발생 한다.")
    @Test
    void failCreateCoin() {
        assertThrows(InvalidCoinException.class,
                () -> new Coin(110));
    }
}