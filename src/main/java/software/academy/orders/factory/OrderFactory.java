package software.academy.orders.factory;

import software.academy.orders.domain.Client;
import software.academy.orders.domain.Order;
import software.academy.orders.strategy.PercentageRebateStrategy;
import software.academy.orders.strategy.RebateStrategy;

public class OrderFactory {

    public Order createOrder(int orderId, Client client) {
        Order order = new Order(orderId, client, Order.OrderType.DRAFT);
        RebateStrategy rebateStrategy = new PercentageRebateStrategy();
        order.setRebateStrategy(rebateStrategy);
        return order;
    }
}
