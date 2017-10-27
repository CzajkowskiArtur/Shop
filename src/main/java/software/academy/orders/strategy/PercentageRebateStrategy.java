package software.academy.orders.strategy;

import software.academy.orders.domain.Money;
import software.academy.orders.domain.Order;

public class PercentageRebateStrategy implements RebateStrategy {

    public Money calculateRebate(Order order) {
        Money money=order.getCurrentCost();
        return money.multiplyBy(0.1f);
    }
}
