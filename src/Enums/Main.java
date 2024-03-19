package Enums;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        // create a shop with opening hours
        OpeningHours openingHours = new OpeningHours("07:00", "23:00", OpeningVariations.MONTOFRI);
        Shop coffeShop = new Shop("Café Coffee", openingHours);

        // option 1: save different steps into different variables before continuing to work with them
        OpeningHours openingHoursCoffee = coffeShop.getOpeningHours();
        String isOpen = openingHoursCoffee.getOpeningHoursToday(DayOfWeek.TUESDAY);
        System.out.println(coffeShop.getName() + isOpen);

        // option 2: do everything all at once
        System.out.println(coffeShop.getName() + coffeShop.getOpeningHours().getOpeningHoursToday(DayOfWeek.SATURDAY));
    }
}
