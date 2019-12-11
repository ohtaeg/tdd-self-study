package money.wonnote;

import exception.InvalidWonNoteException;
import module.MoneyChecker;
import module.WonNoteChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class KoreaWonNoteTypeTest {

    private MoneyChecker moneyChecker;

    @BeforeEach
    void setUp() {
        moneyChecker = new WonNoteChecker();
    }

    @DisplayName("한국 지폐에 맞는 금액이면 성공을 반환한다.")
    @ParameterizedTest
    @ValueSource(ints = {1000, 5000, 10000, 50000})
    void instanceOf(int input) {
        // when
        KoreaWonNoteType actual = (KoreaWonNoteType) moneyChecker.check(input);

        // then
        assertThat(actual).isInstanceOf(KoreaWonNoteType.class);
    }

    @DisplayName("한국 지폐에 맞는 금액이 아니면 예외를 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {123, 20000, 5, -1000})
    void checkFail(int input) {
        assertThatExceptionOfType(InvalidWonNoteException.class).isThrownBy(
                () -> moneyChecker.check(input)
        );
    }
}