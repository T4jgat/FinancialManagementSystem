package kz.t4jgat.DataSources;

public class BasicDiscount implements Discount {
    private final String discountType = "For all users";
    private String title;

    public BasicDiscount(String title) {
        this.title = title;
    }

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
