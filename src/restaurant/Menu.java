package restaurant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Menu {
// adds the date to the menu
    static Date updated = new Date();
    static SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");
    static String strDate = formatDate.format(updated);

//sorts the menu items into their specific courses and displays them.
    public static void displayMenu(ArrayList<MenuItem> fancyMenu){
        ArrayList<MenuItem> appetizers = new ArrayList<>();
        ArrayList<MenuItem> mains = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();
        for(MenuItem item : fancyMenu){
            if(item.getCourse().equals("appetizer")){
                appetizers.add(item);
            }
            if(item.getCourse().equals("main")){
                mains.add(item);
            }
            if(item.getCourse().equals("dessert")){
                desserts.add(item);
            }
        }
        System.out.println("Menu recently updated on: "+ strDate);
        System.out.println("~Appetizers~");
        for(MenuItem item: appetizers){
            if(item.getIsNew()){
                System.out.println("New item Just added!");
            }
            System.out.println(item);
        }
        System.out.println("~Mains~");
        for(MenuItem item: mains){
            if(item.getIsNew()){
                System.out.println("New item Just added!");
            }
            System.out.println(item);
        }
        System.out.println("~Desserts~");
        for(MenuItem item: desserts){
            if(item.getIsNew()){
                System.out.println("New item Just added!");
            }
            System.out.println(item);
        }
    }
// this is used to display specific menu items
    public static void displayItem(MenuItem dish){
        System.out.println(dish);
    }

    public static void addMenuItem(ArrayList<MenuItem> menu, MenuItem dish){
        menu.add(dish);
    }

    public static void removeMenuItem(ArrayList<MenuItem>menu,MenuItem dish){
        menu.remove(dish);
    }




}
