package dev.vishsiri;
import java.util.ArrayList;
import java.util.List;

class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();
    private String currentScore = "N/A";

    public void addListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String score) {
        currentScore = score;
        notifyListeners(new ScoreEvent(this, score));
    }

    private void notifyListeners(ScoreEvent event) {
        for (ScoreListener listener : listeners) {
            listener.scoreChange(event);
        }
    }
}