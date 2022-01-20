package restaurant;

import java.util.ArrayList;
import java.util.Collections;

public class Restaurant {

    public static void main(String[] args) {
        ArrayList<MenuItem> fancyMenu = new ArrayList<>();
        MenuItem item1 = new MenuItem("cobb salad","appetizer", "just a boring salad", 8.99, false);
        MenuItem item2 = new MenuItem("QT taquitos", "appetizer", "drove to QuickTrip and picked them up ourselves", 6.76, false);
        MenuItem item3 = new MenuItem("alfredo?","main", "We think its noodles and sauce? honestly we cant tell", 14.99, false  );
        MenuItem item4 = new MenuItem(" Le Microwaved special", "main", "we made the soup yesterday.", 3.99, false);
        MenuItem item5 = new MenuItem("Ice Cream", "dessert", "its literally just ice cream", 7.98, false );
        MenuItem item6 = new MenuItem("death by Chocolat", "dessert", "Johnny Depp comes to your table and acts at you", 49.99, true);

        Collections.addAll(fancyMenu, item1, item2, item3, item4, item5, item6);
        Menu.displayMenu(fancyMenu);
        Menu.displayItem(item6);
    }
}
