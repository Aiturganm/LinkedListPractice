package task3;

import task3.menu.MenuItem;
import task3.menu.RestorantMenu;
import task3.service.impl.RestaurantService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService();
        System.out.println("All menu: \nDishes");
        System.out.println(restaurantService.create(new MenuItem("dishes", "Spaghetti Bolognese", 12.99, 30)));
        System.out.println(restaurantService.create(new MenuItem("dishes", "Chicken Alfredo Pasta", 14.99, 40)));
        System.out.println(restaurantService.create(new MenuItem("dishes", "Grilled Salmon", 18.99, 25)));
        System.out.println(restaurantService.create(new MenuItem("dishes", "Vegetarian Pad Thai", 10.99, 35)));
        System.out.println(restaurantService.create(new MenuItem("dishes", "Beef Tacos ", 9.99, 20)));
        System.out.println("\nDrinks");
        System.out.println(restaurantService.create(new MenuItem("drinks", "Classic Mojito", 8.99, 5)));
        System.out.println(restaurantService.create(new MenuItem("drinks", "Strawberry Mint Lemonade", 5.99, 10)));
        System.out.println(restaurantService.create(new MenuItem("drinks", "Espresso Martini", 10.99, 8)));
        System.out.println(restaurantService.create(new MenuItem("drinks", "Mango Tango Smoothie", 6.99, 5)));
        System.out.println(restaurantService.create(new MenuItem("drinks", "Cucumber Basil Sparkler", 7.99, 7)));
        System.out.println("\nSalads");
        System.out.println(restaurantService.create(new MenuItem("salads", "Caesar Salad with Grilled Chicken", 10.99, 15)));
        System.out.println(restaurantService.create(new MenuItem("salads", "Caprese Salad", 8.99, 10)));
        System.out.println(restaurantService.create(new MenuItem("salads", "Quinoa and Roasted Vegetable Salad", 12.99, 20)));
        System.out.println(restaurantService.create(new MenuItem("salads", "Greek Salad", 9.99, 15)));
        System.out.println(restaurantService.create(new MenuItem("salads", "Asian Sesame Ginger Salad", 14.99, 25)));
        System.out.println("\nDessets");
        System.out.println(restaurantService.create(new MenuItem("desserts", "Chocolate Lava Cake", 8.99, 25)));
        System.out.println(restaurantService.create(new MenuItem("desserts", "Classic New York Cheesecake", 10.99, 40)));
        System.out.println(restaurantService.create(new MenuItem("desserts", "Tiramisu", 9.99, 30)));
        System.out.println(restaurantService.create(new MenuItem("desserts", "Fresh Berry Parfait", 7.99, 15)));
        System.out.println(restaurantService.create(new MenuItem("desserts", "Apple Pie ", 12.99, 50)));

        while (true) {
            System.out.println("""
                    
                    1. REMOVE
                    2. GET ALL
                    3. SORT BY PRICE
                    4. GET BY NAME
                    """);
            switch (new Scanner(System.in).nextLine()) {
                case "1" -> {
                    System.out.println("Enter name of menu: ");
                    restaurantService.remove(new Scanner(System.in).nextLine());
                    System.out.println("Successfully removed!");
                }
                case "2" -> {
                    restaurantService.getAll();
                }
                case "3" -> {
                    restaurantService.sortByPrice();
                }
                case "4" -> {
                    System.out.println("Enter name of menu: ");
                    System.out.println(restaurantService.getByName(new Scanner(System.in).nextLine()));
                }
            }
        }
    }
}
