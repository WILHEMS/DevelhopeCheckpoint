package exercise;

import java.util.Arrays;
import java.util.List;

public class Restaurant {
    public String name;
    public String cusine;
    public String menuItem;
    public List<String> menu[];

    public Restaurant(String name, String cusine) {
        this.name = name;
        this.cusine = cusine;
    }

    public String addMenu(Restaurant restaurant, String menuItem){
        this.name = restaurant.name;
        this.cusine = restaurant.cusine;
        Arrays.stream(this.menu);
        return restaurant.name + restaurant.cusine + restaurant.menu;
    }
}
