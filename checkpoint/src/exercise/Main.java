package exercise;

public class Main {
    public static void main(String[] args) {
        Country country = new Country("Kenya", 40_000_000,"Nairobi");
        System.out.println("Country name is "+ country.name+" the population is "+ country.population+" the capital is "+country.capital);

        Restaurant restaurant = new Restaurant("Sarova","Jacuzzi");
        restaurant.addMenu(restaurant, "Fish");
        System.out.println(restaurant.menuItem);
    }
}
