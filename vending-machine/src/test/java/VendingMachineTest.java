import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

class VendingMachineTest {
    private VendingMachine vendingMachine;

    @BeforeEach
    public void setup() {
        vendingMachine = new VendingMachine();
    }

    @Test
    @DisplayName("[금액 출력] : 투입된 금액이 없을 경우 0원을 출력 한다.")
    public void getReturnAmount_Zero() {
        assertThat(vendingMachine.getCurrentMoney()).isZero();
    }


}