package kz.t4jgat.Notifications;

import kz.t4jgat.DataSources.Discount;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
