package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Meal> meals;
    private List<Drink> drinks;
    public List<Drink> drinkList;
    public List<Meal> mealList;


    public Menu() {
        this.drinks = new ArrayList<>();
        this.meals = new ArrayList<>();
        this.drinkList = new ArrayList<>();
        this.mealList= new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
        mealList.add((Meal) meal);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
        drinkList.add((Drink) drink);
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void deleteMeal(int id) {
        meals.remove(id - 1);
    }

    public void deleteDrink(int id) {
        drinks.remove(id - 1);
    }
    public String getName(int id){
        return meals.get(id).getName();
    }

}
