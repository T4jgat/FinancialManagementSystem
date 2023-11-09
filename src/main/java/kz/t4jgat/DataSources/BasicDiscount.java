package kz.t4jgat.DataSources;

import java.util.ArrayList;
import java.util.List;

public class BasicDiscount implements Discounts{
    private final String discountType = "For all users";
    private String title;

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDiscountType() {
        return discountType;
    }


}
