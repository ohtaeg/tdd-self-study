package money.coin;

import exception.InvalidCoinException;
import module.CoinChecker;
import module.MoneyChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class KoreaCoinTypeTest {

    private MoneyChecker moneyChecker;

    @BeforeEach
    void setUp() {
        moneyChecker = new CoinChecker();
    }

    @DisplayName("한국 동전에 맞는 금액이면 성공을 반환한다.")
    @ParameterizedTest
    @ValueSource(ints = {10, 50, 100, 500})
    void instanceOf(int input) {
        // when
        KoreaCoinType actual = (KoreaCoinType) moneyChecker.check(input);

        // then
        assertThat(actual).isInstanceOf(KoreaCoinType.class);
    }

    @DisplayName("한국 동전에 맞는 금액이 아니면 예외를 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {5, 111, 123, 1000})
    void checkFail(int input) {
        assertThatExceptionOfType(InvalidCoinException.class).isThrownBy(
                () -> moneyChecker.check(input)
        );
    }
}