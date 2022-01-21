package restaurant;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class MenuItem {
    private String name;
    private String course;
    private String description;
    private double price;
    private boolean isNew;


    public MenuItem(String name, String course, String description, double price ,boolean isNew){
        this.name = name;
        this.course = course;
        this.description = description;
        this.price = price;
        this.isNew = isNew;

    }
//getters and setters as well as the tostring method for displaying menuitem
    public String toString(){
        return name + "\n" + description + "\n"+ "$" + price +"\n******" ;
    }
    public String getname(){
        return this.name;
    }
    public String getCourse(){
        return this.course;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean getIsNew(){
        return this.isNew;
    }

    public boolean equals(MenuItem toBeCompared){
        if(toBeCompared == null){
            return false;
        }
        if(toBeCompared == this){
            return true;
        }
        if(toBeCompared.getClass() != getClass()){
            return false;
        }
        return toBeCompared.getname().equals( this.getname());

    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MenuItem menuItem = (MenuItem) o;
//        return Objects.equals(name, menuItem.name) && Objects.equals(course, menuItem.course);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, course);
//    }
}
