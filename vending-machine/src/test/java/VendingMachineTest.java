import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.Assertions.assertThat;

class VendingMachineTest {
    private VendingMachine vendingMachine;

    @BeforeEach
    public void setup() {
        vendingMachine = new VendingMachine();
    }

    @Test
    @DisplayName("[금액 출력] : 투입된 금액이 없을 경우 0원을 출력 한다.")
    public void getReturnAmountZero() {
        assertThat(vendingMachine.getCurrentMoney()).isZero();
    }

    @ParameterizedTest
    @DisplayName("[금액 출력] : 투입된 금액이 있을 경우 0원을 출력할 수 없다.")
    @ValueSource(ints = 100)
    public void getCurrentMoney_NotZero(int coin) {
        // given : 투입된 금액이 존재함.
        vendingMachine.insertCoin(coin);

        // when :
        int returnedAmount = vendingMachine.getCurrentMoney();

        // then
        assertThat(returnedAmount).isNotZero();
    }

    @ParameterizedTest
    @DisplayName("[동전 확인] : 우리나라 동전 금액 단위일 경우 true를 반환 한다.")
    @ValueSource(ints = {10, 50, 100, 500})
    public void isKoreaCoinUnitSuccess(int coin) {
        // when
        boolean isCorrect = vendingMachine.isCorrect(coin);

        // then
        assertThat(isCorrect).isTrue();
    }

    @ParameterizedTest
    @DisplayName("[동전 확인] : 우리나라 동전 금액 단위가 아닐 경우 false를 반환 한다.")
    @ValueSource(ints = {-10, 1, 12, 123})
    public void isKoreaCoinUnitFail(int coin) {
        // when
        boolean isUse = vendingMachine.isCorrect(coin);

        // then
        assertThat(isUse).isFalse();
    }
}