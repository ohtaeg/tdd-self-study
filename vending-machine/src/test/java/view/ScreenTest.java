package view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScreenTest {

    private Screen screen;
    @BeforeEach
    void setUp() {
        screen = new Screen();
    }

    @DisplayName("[금액 출력] 0원을 출력한다.")
    @Test
    public void printZero() {

    }
}