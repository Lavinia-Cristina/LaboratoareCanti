package lab11;

import java.util.Observer;

public interface Subject {
    void addObserver(lab11.Observer observer);

    void removeObserver(lab11.Observer observer);

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}