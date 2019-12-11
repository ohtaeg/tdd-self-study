package module;

import exception.InvalidCoinException;
import money.coin.KoreaCoinType;

import java.util.Arrays;

public final class CoinChecker implements MoneyChecker {

    @Override
    public KoreaCoinType check(final Integer won) {
        return Arrays.stream(KoreaCoinType.values())
                     .filter(koreaCoin -> koreaCoin.getWon() == won)
                     .findFirst()
                     .orElseThrow(InvalidCoinException::new);
    }
}
