package software.academy.orders.strategy;

import software.academy.orders.domain.Money;
import software.academy.orders.domain.Order;

public interface RebateStrategy {
    Money calculateRebate(Order order);
}
