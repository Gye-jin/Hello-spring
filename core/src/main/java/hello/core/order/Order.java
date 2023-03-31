package hello.core.order;

public class Order {
    private Long memberId;
    private String itemMame;

    private int itemPrice;

    private int discountPrice;

    public Order(Long memberId, String itemMame, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemMame = itemMame;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }
    public int calculatePrice(){
        return itemPrice-discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemMame() {
        return itemMame;
    }

    public void setItemMame(String itemMame) {
        this.itemMame = itemMame;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemMame='" + itemMame + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
