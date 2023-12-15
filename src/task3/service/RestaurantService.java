package task3.service;

import task3.menu.MenuItem;
import task3.menu.RestorantMenu;

public interface RestaurantService {
    MenuItem create(MenuItem menuItem);
    void remove(String name);
    void getAll();
    void sortByPrice();
    MenuItem getByName(String name);
}
