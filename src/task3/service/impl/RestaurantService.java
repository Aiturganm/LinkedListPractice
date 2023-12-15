package task3.service.impl;

import task3.menu.MenuItem;
import task3.menu.RestorantMenu;

import java.util.Collections;

public class RestaurantService implements task3.service.RestaurantService {
    long counter = 1;
    RestorantMenu restorantMenu = new RestorantMenu();

    @Override
    public MenuItem create(MenuItem menuItem) {
        menuItem.setId(counter++);
        if (menuItem.getType().equalsIgnoreCase("dishes")) {
            restorantMenu.dishes.add(menuItem);
        } else if (menuItem.getType().equalsIgnoreCase("drinks")) {
            restorantMenu.drinks.add(menuItem);
        } else if (menuItem.getType().equalsIgnoreCase("salads")) {
            restorantMenu.salads.add(menuItem);
        } else if (menuItem.getType().equalsIgnoreCase("desserts")) {
            restorantMenu.desserts.add(menuItem);
        }

        return menuItem;
    }

    @Override
    public void remove(String name) {
        for (int i = 0; i < restorantMenu.dishes.size(); i++) {
            if (restorantMenu.dishes.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(restorantMenu.dishes.get(i));
                restorantMenu.dishes.remove(restorantMenu.dishes.get(i));
            }
        }
        for (int i = 0; i < restorantMenu.drinks.size(); i++) {
            if (restorantMenu.drinks.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(restorantMenu.drinks.get(i));
                restorantMenu.drinks.remove(restorantMenu.drinks.get(i));
            }
        }
        for (int i = 0; i < restorantMenu.salads.size(); i++) {
            if (restorantMenu.salads.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(restorantMenu.salads.get(i));
                restorantMenu.salads.remove(restorantMenu.salads.get(i));
            }
        }
        for (int i = 0; i < restorantMenu.desserts.size(); i++) {
            if (restorantMenu.desserts.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(restorantMenu.desserts.get(i));
                restorantMenu.desserts.remove(restorantMenu.desserts.get(i));
            }
        }
    }

    @Override
    public void getAll() {
        for (int i = 0; i < restorantMenu.dishes.size(); i++) {
            System.out.println(restorantMenu.dishes.get(i));
        }
        System.out.println();
        for (MenuItem drink : restorantMenu.drinks) {
            System.out.println(drink);
        }
        System.out.println();
        for (MenuItem salad : restorantMenu.salads) {
            System.out.println(salad);
        }
        System.out.println();
        for (MenuItem dessert : restorantMenu.desserts) {
            System.out.println(dessert);
        }
    }

    @Override
    public void sortByPrice() {
        Collections.sort(restorantMenu.dishes);
        System.out.println("Sort by price dishes: ");
        for (MenuItem dish : restorantMenu.dishes) {
            System.out.println(dish);
        }
        System.out.println("Sort by price drinks");
        Collections.sort(restorantMenu.drinks);
        for (MenuItem drink : restorantMenu.drinks) {
            System.out.println(drink);
        }
        System.out.println("Sort by price salads");
        Collections.sort(restorantMenu.salads);
        for (MenuItem salad : restorantMenu.salads) {
            System.out.println(salad);
        }
        System.out.println("Sort by price desserts");
        Collections.sort(restorantMenu.desserts);
        for (MenuItem dessert : restorantMenu.desserts) {
            System.out.println(dessert);
        }
    }

    @Override
    public MenuItem getByName(String name) {
        for (int i = 0; i < restorantMenu.dishes.size(); i++) {
            if (restorantMenu.dishes.get(i).getName().equalsIgnoreCase(name)) {
                return restorantMenu.dishes.get(i);
            }
        }
        for (int i = 0; i < restorantMenu.drinks.size(); i++) {
            if (restorantMenu.drinks.get(i).getName().equalsIgnoreCase(name)) {
                return restorantMenu.drinks.get(i);
            }
        }
        for (int i = 0; i < restorantMenu.salads.size(); i++) {
            if (restorantMenu.salads.get(i).getName().equalsIgnoreCase(name)) {
                return restorantMenu.salads.get(i);
            }
        }
        for (int i = 0; i < restorantMenu.desserts.size(); i++) {
            if (restorantMenu.desserts.get(i).getName().equalsIgnoreCase(name)) {
                return restorantMenu.desserts.get(i);
            }
        }
        return null;
    }
}
