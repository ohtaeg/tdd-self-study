import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class VendingMachineTest {
    private VendingMachine vendingMachine;

    @BeforeEach
    public void setup() {
        vendingMachine = new VendingMachine();
    }

    @DisplayName("[금액 출력] : 투입된 금액이 없을 경우 0원을 출력 한다.")
    @Test
    public void getReturnAmountZero() {
        assertThat(vendingMachine.getCurrentMoney()).isZero();
    }

    @DisplayName("[동전 확인] : 우리나라 동전 금액 단위일 경우 true를 반환 한다.")
    @ParameterizedTest
    @EnumSource(value = KoreaCoins.class, names = {"TEN_WON", "FIFTY_WON", "ONE_HUNDRED_WON", "FIVE_HUNDRED_WON"})
    public void isKoreaCoinUnit(KoreaCoins coin) {
        // when
        boolean isKoreaCoinUnit = vendingMachine.isKoreaCoinUnit(coin);

        // then
        assertThat(isKoreaCoinUnit).isTrue();
    }

    @DisplayName("[동전 확인] 누적된 금액 확인을 할 수 있다.")
    @Test
    public void getCurrentMoney() {
        // when
        vendingMachine.insertCoin(KoreaCoins.TEN_WON);
        vendingMachine.insertCoin(KoreaCoins.FIFTY_WON);
        vendingMachine.insertCoin(KoreaCoins.ONE_HUNDRED_WON);
        vendingMachine.insertCoin(KoreaCoins.FIVE_HUNDRED_WON);
        int money = vendingMachine.getCurrentMoney();

        // then
        assertThat(money).isEqualTo(660);
    }

    @DisplayName("[지폐 확인] 우리나라 지폐 금액 단위 일경우 성공을 반환 한다.")
    @ParameterizedTest
    @EnumSource(value = KoreaWonNote.class, names = {"THOUSAND", "FIVE_THOUSAND", "TEN_THOUSAND", "FIFTY_THOUSAND"})
    public void isKoreaWonNote(KoreaWonNote won) {
        boolean isBill = vendingMachine.isKoreaWonNote(won);

        assertThat(isBill).isTrue();
    }


}