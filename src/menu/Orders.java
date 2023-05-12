package menu;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private double bell = 0;
    private List<Order> ordersList;

    public Orders() {
        ordersList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public List<Order> getOrder() {
        return ordersList;
    }

    public double getAllBell() {
        for (int i = 0; i < ordersList.size(); i++) {
            bell += ordersList.get(i).sumPrice();

        }
        return bell;
    }



}
