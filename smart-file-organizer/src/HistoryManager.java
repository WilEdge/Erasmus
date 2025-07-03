import java.util.ArrayDeque;
import java.util.Deque;

public class HistoryManager {
    private final Deque<HistoryEntry> history = new ArrayDeque<>();

    public void record(HistoryEntry entry) {
        history.push(entry);
    }
    public HistoryEntry undoLast() {
        return history.poll();
    }

    public boolean hasHistory() {
        return !history.isEmpty();
    }
}
