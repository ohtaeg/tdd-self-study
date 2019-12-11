package money.wonnote;

import module.WonNoteChecker;
import money.Money;

import java.util.Objects;

public final class WonNote extends Money {
    private final KoreaWonNoteType wonNote;
    private final static WonNoteChecker WON_NOTE_CHECKER = new WonNoteChecker();

    public WonNote(KoreaWonNoteType wonNote) {
        this.wonNote = wonNote;
    }
    public WonNote(int value) {
        this(WON_NOTE_CHECKER.check(value));
    }

    @Override
    public Integer getMoney() {
        return wonNote.getWon();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final WonNote wonNote1 = (WonNote) o;
        return wonNote == wonNote1.wonNote;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wonNote);
    }
}
