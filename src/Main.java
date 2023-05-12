import menu.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();


        menu.addMeal(new Meal(1, "baliq", 9));
        menu.addMeal(new Meal(2, "doner", 3));
        menu.addMeal(new Meal(3, "burger", 5));
        menu.addMeal(new Meal(4, "Kumpir", 6));
        menu.addMeal(new Meal(5, "Tyox qanadlari", 5));
        menu.addDrink(new Drink(6, "cola", 2));
        menu.addDrink(new Drink(7, "fanta", 1));
        menu.addDrink(new Drink(8, "Mountain dew", 2.5));
        menu.addDrink(new Drink(9, "Cappy", 1.5));


        System.out.println("Yemekler : ");
        for (Meal meal : menu.getMeals()) {
            System.out.println("Mehsulun id: " + " " + meal.getId() + " |  " + meal.getName() + " |  " + meal.getPrice() + "azn");
        }
        System.out.println("Ickiler : ");
        for (Drink drink : menu.getDrinks()) {
            System.out.println("Mehsulun id: " + " " + drink.getId() + " |  " + drink.getName() + " |  " + drink.getPrice() + "azn");
        }


        AllOrders allOrders= new AllOrders();

        do {
            Scanner sc= new Scanner(System.in);
            Orders orders = new Orders();
            Order order;
            boolean state = true;
            do {
                System.out.println("Yemek ucun - Y, Icki ucun I basin...");
                String situation= sc.nextLine();
                System.out.println("");
                int orderCount;
                Scanner scan = new Scanner(System.in);
                   if(situation.contains("y") || situation.contains("Y")){
                       System.out.println("Yemek id daxil edin: ");
                       int orderNum = scan.nextInt();
                    if (orderNum > 0 && orderNum<menu.mealList.size()) {
                        System.out.println("Mehsul Miqdari daxil edin: ");
                        orderCount = scan.nextInt();
                        order = new Order(orderNum, menu.mealList.get(orderNum - 1).getName(), menu.mealList.get(orderNum - 1).getPrice(), 12, orderCount);
                        orders.addOrder(order);
                        System.out.println(order.getName() + " " + "Hesab : " + order.sumPrice() + " " + "azn");
                        System.out.println(" ");
                    }else {
                        System.out.println("Qeyd etdiyiniz mehsul menyuda yoxdur");
                    }
                   } else if (situation.contains("I") || situation.contains("i")) {
                       System.out.println("Icki id daxil edin: ");
                       int orderNum = scan.nextInt();
                       if (orderNum > 0 && orderNum<menu.drinkList.size()) {
                           System.out.println("Mehsul Miqdari daxil edin: ");
                           orderCount = scan.nextInt();
                           order = new Order(orderNum, menu.drinkList.get(orderNum-1).getName(), menu.drinkList.get(orderNum-1).getPrice(), 12, orderCount);
                           orders.addOrder(order);
                           System.out.println(order.getName() + " " + "Hesab : " + order.sumPrice() + " " + "azn");
                           System.out.println(" ");
                       }
                       else {
                           System.out.println("Qeyd etdiyiniz mehsul menyuda yoxdur");
                       }
                   } else if (situation.contains("H") || situation.contains("h")) {

                           for (Order ord : orders.getOrder()) {
                               System.out.println(ord.getName() + " " + ord.sumPrice() + " " + " azn");
                           }
                           System.out.println(" ");
                           System.out.println("Umumi hesab : " + orders.getAllBell() + "azn");
                           System.out.println(" ");
                           System.out.println(" ");
                           System.out.println("Yeni Sifaris: ");
                           allOrders.addOrders(orders);
                           state = false;
                   }
            } while (state);
            for (Orders orders1 : allOrders.getOrders()) {
                System.out.println(orders1.getOrder());
                System.out.println("");
            }
        }while (true);
    }
}
