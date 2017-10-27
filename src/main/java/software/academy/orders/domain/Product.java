package software.academy.orders.domain;

public class Product {

    public Product(String name, Money price, ProductType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    private int id;

    private String name;

    private Money price;

    public enum ProductState {
        AVAILABLE, EXPIRED;
    }

    public enum ProductType {
        FOOD,DRINK,ELECTRONICS
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    private ProductType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    private ProductState state;

    public boolean equals(Product product) {
        if (this.getName().equals(product.getName())
                && this.getType().equals(product.getType())
                && this.getPrice().equals(product.getPrice())
                ) {
            return true;
        }
        return false;
    }
}
