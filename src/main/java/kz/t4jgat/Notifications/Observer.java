package kz.t4jgat.Notifications;

import kz.t4jgat.DataSources.Discount;

import java.util.List;

public interface Observer {
    void handleEvent(List<Discount> discounts);
}
