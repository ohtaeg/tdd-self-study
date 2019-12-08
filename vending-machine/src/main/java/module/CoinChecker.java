package module;

import exception.InvalidCoinException;
import money.coin.KoreaCoinType;

import java.util.Arrays;

public final class CoinChecker {
    public static KoreaCoinType check(int won) {
        return Arrays.stream(KoreaCoinType.values())
                     .filter(koreaCoin -> koreaCoin.getWon() == won)
                     .findFirst()
                     .orElseThrow(() -> new InvalidCoinException());
    }
}
