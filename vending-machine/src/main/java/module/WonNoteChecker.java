package module;

import exception.InvalidWonNoteException;
import money.wonnote.KoreaWonNoteType;

import java.util.Arrays;

public class WonNoteChecker implements MoneyChecker{
    @Override
    public KoreaWonNoteType check(final Integer won) {
        return Arrays.stream(KoreaWonNoteType.values())
                .filter(wonNote -> wonNote.getWon() == won)
                .findFirst()
                .orElseThrow(InvalidWonNoteException::new);
    }
}
