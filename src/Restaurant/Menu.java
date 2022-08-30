package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu{
    ArrayList<MenuItems> items;
    private Date lastUpdated;

    public ArrayList<MenuItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItems> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Menu(ArrayList<MenuItems> items, Date lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }
}
