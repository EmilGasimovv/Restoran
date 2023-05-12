package menu;

import java.util.ArrayList;
import java.util.List;

public class AllOrders {
    private List<Orders> allOrders;

    public AllOrders() {
        this.allOrders = new ArrayList<>();
    }
    public void addOrders(Orders orders){
        allOrders.add(orders);
    }
    public List<Orders> getOrders(){
        return allOrders;
    }
}
