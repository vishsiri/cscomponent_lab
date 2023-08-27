package dev.vishsiri;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
class LiveScoreBean {
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private String scoreLine;

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String scoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = scoreLine;
        propertyChangeSupport.firePropertyChange("scoreLine", oldScoreLine, scoreLine);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}