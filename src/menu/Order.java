package menu;

public class Order {




    private int orderId;
    private String name;
    private int tableNumber;
    private double price ;
    private int orderCount;


    public Order(int orderId, String name, double price, int tableNumber, int orderCount) {
        this.orderId = orderId;
        this.name = name;
        this.price = price;
        this.tableNumber = tableNumber;
        this.orderCount = orderCount;

    }

    public int getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public int getOrderNumber() {
        return tableNumber;
    }



    public int getOrderCount() {
        return orderCount;
    }

    public double sumPrice(){
        return orderCount*price;
    }

    @Override
    public String toString() {
        return
                "foodNumber=" + orderId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", orderCount=" + orderCount ;
    }
}
