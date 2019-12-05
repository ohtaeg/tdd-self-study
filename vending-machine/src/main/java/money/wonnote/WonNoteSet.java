package money.wonnote;

import java.util.ArrayList;
import java.util.List;

public final class WonNoteSet {
    private List<KoreaWonNote> wonNoteSets;

    private WonNoteSet(List<KoreaWonNote> wonNoteSets) {
        this.wonNoteSets = wonNoteSets;
    }

    public static WonNoteSet createWonNoteSet() {
        return new WonNoteSet(new ArrayList<>());
    }

    public void add(KoreaWonNote wonNote) {
        this.wonNoteSets.add(wonNote);
    }

    public int getWonNotes() {
        int money = 0;
        for (KoreaWonNote wonNote : wonNoteSets) {
            money += wonNote.getWon();
        }
        return money;
    }
}
