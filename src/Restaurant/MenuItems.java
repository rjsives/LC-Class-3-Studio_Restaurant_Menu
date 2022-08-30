package Restaurant;

public class MenuItems {
        private String name;
        private String description;
        private String category;
        private Double price;
        private int dateAdded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }

    public MenuItems(String name, String description, String category, Double price, int dateAdded) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateAdded = dateAdded;
    }

    public MenuItems(String name, String description, String category,  int dateAdded) {
        this (name, description, category, 20.50, dateAdded);
    }
}
