package software.academy.orders.domain;

public class OrderItem {

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    private Product product;

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    private int quantity;

    public Money getCost() {
        return product.getPrice().multiplyBy(quantity);
    }

}
