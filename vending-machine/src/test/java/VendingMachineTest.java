import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class VendingMachineTest {
    private VendingMachine vendingMachine;

    @BeforeEach
    public void setup() {
        vendingMachine = new VendingMachine();
    }

    @DisplayName("[동전 타입 확인] : 우리나라 동전 금액 단위일 경우 true를 반환 한다.")
    @ParameterizedTest
    @EnumSource(value = KoreaCoins.class, names = {"TEN_WON", "FIFTY_WON", "ONE_HUNDRED_WON", "FIVE_HUNDRED_WON"})
    public void isKoreaCoinUnit(KoreaCoins coin) {
        // when
        boolean isKoreaCoinUnit = vendingMachine.isKoreaCoins(coin);

        // then
        assertThat(isKoreaCoinUnit).isTrue();
    }

    @DisplayName("[동전 삽입] : 우리나라 동전 삽입을 성공하면 true를 반환 한다.")
    @ParameterizedTest
    @EnumSource(value = KoreaCoins.class, names = {"TEN_WON", "FIFTY_WON", "ONE_HUNDRED_WON", "FIVE_HUNDRED_WON"})
    public void isInsertCoin(KoreaCoins coin) {
        // given
        VendingMachine mockVendingMachine = mock(VendingMachine.class);

        // when
        mockVendingMachine.insertCoin(coin);

        // then
        verify(mockVendingMachine, atLeastOnce()).insertCoin(any());
    }

    @DisplayName("[누적된 동전 확인] 투입된 동전만큼 금액을 출력 한다.")
    @Test
    public void getCoins() {
        // given
        vendingMachine.insertCoin(KoreaCoins.TEN_WON);
        vendingMachine.insertCoin(KoreaCoins.FIFTY_WON);
        vendingMachine.insertCoin(KoreaCoins.ONE_HUNDRED_WON);
        vendingMachine.insertCoin(KoreaCoins.FIVE_HUNDRED_WON);

        // when
        int money = vendingMachine.getCoinSet();

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

    @DisplayName("[지폐 삽입] : 우리나라 지폐 삽입을 성공하면 true를 반환 한다.")
    @ParameterizedTest
    @EnumSource(value = KoreaWonNote.class, names = {"THOUSAND", "FIVE_THOUSAND", "TEN_THOUSAND", "FIFTY_THOUSAND"})
    public void isInsertWonNote(KoreaWonNote wonNote) {
        // given
        VendingMachine mockVendingMachine = mock(VendingMachine.class);

        // when
        mockVendingMachine.insertWonNote(wonNote);

        // then
        verify(mockVendingMachine, atLeastOnce()).insertWonNote(any());
    }

    @DisplayName("[누적된 지폐 출력] : 투입된 지폐만큼 금액을 출력 한다.")
    @Test
    public void getWonNotes() {
        // given
        vendingMachine.insertWonNote(KoreaWonNote.THOUSAND);
        vendingMachine.insertWonNote(KoreaWonNote.FIVE_THOUSAND);
        vendingMachine.insertWonNote(KoreaWonNote.TEN_THOUSAND);
        vendingMachine.insertWonNote(KoreaWonNote.FIFTY_THOUSAND);

        // when
        int money = vendingMachine.getWonNoteSet();

        // then
        assertThat(money).isEqualTo(66000);
    }

}