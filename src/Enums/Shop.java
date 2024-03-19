package Enums;

public class Shop {
    // name of shop
    private final String name;
    // opening hours defined for the shop
    private final OpeningHours openingHours;

    // constructor with all fields
    public Shop(String name, OpeningHours openingHours) {
        this.name = name;
        this.openingHours = openingHours;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for opening hours
    public OpeningHours getOpeningHours() {
        return openingHours;
    }
}
