package dev.vishsiri;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
class Subscriber implements PropertyChangeListener {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result: " + evt.getNewValue() + " " + name);
    }
}