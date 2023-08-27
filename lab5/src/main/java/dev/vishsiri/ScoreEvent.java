package dev.vishsiri;
import java.util.EventObject;
class ScoreEvent extends EventObject {
    private String score;

    public ScoreEvent(Object source, String score) {
        super(source);
        this.score = score;
    }

    public String getScore() {
        return score;
    }
}