package money.wonnote;

import exception.InvalidWonNoteException;
import money.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class WonNoteTest {
    @DisplayName("[지폐 확인] 한국 지폐에 맞지 않는 금액을 던지면 예외를 발생 한다.")
    @Test
    void failCreateWonNote() {
        // given
        int value = 110;

        // when then
        assertThatExceptionOfType(InvalidWonNoteException.class)
                .isThrownBy(() -> new WonNote(value));
    }

    @DisplayName("[지폐 확인] 정수를 파라미터로 해당 금액만큼 지폐가 생성된다.")
    @ParameterizedTest
    @ValueSource(ints ={1000, 5000, 10000, 50000})
    void createWonNote(int value) {
        // when
        Money wonNote = new WonNote(value);

        // then
        assertAll("생성된 지폐와 파라미터와 일치",
                () -> assertThat(wonNote.getMoney()).isNotNull(),
                () -> assertThat(wonNote.getMoney()).isEqualTo(value)
        );
    }

    @DisplayName("[지폐 확인] 한국 지폐의 금액만큼 지폐 생성된다.")
    @ParameterizedTest
    @EnumSource(value = KoreaWonNoteType.class, names = {"THOUSAND", "FIVE_THOUSAND", "TEN_THOUSAND", "FIFTY_THOUSAND"})
    void createWonNote(KoreaWonNoteType input) {
        // when
        Money wonNote = new WonNote(input);

        // then
        assertAll("생성된 지폐와 파라미터와 일치",
                () -> assertThat(wonNote.getMoney()).isNotNull(),
                () -> assertThat(wonNote.getMoney()).isEqualTo(input.getWon())
        );
    }
}