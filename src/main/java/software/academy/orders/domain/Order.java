package software.academy.orders.domain;

import software.academy.orders.strategy.RebateStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    private Client client;

    public enum OrderType {
        DRAFT, PAID, CONFIRMED
    }

    private OrderType type;

    public List<OrderItem> getItems() {
        return items;
    }

    public OrderItem getItem(int position) {
        return items.get(position);
    }

    public void setRebateStrategy(RebateStrategy rebateStrategy) {
        this.rebateStrategy = rebateStrategy;
    }

    private RebateStrategy rebateStrategy;

    public Order(int orderId, Client client, OrderType type) {
        this.orderId = orderId;
        this.client = client;
        this.type = type;
    }

    private List<OrderItem> items;

    public void addProduct(Product product, int quantity) {
        if (items==null) {
            items = new ArrayList<OrderItem>();
        }
        //TODO same product problem
        OrderItem orderItem=new OrderItem(product, quantity);
        items.add(orderItem);
    }

    public Money getCurrentCost() {
        // initialize money with zero value
        Money currectCost = new Money(BigDecimal.ZERO);
        if (items!=null) {
            for (OrderItem item: items) {
                currectCost = currectCost.add(item.getCost());
            }
        }
        return currectCost;
    }

    public Money getTotalCost() {
        Money currentCost = getCurrentCost();
        Money rebate=rebateStrategy.calculateRebate(this);
        Money totalCost=currentCost.subtract(rebate);
        return totalCost;
    }




}
