package Enums;

import java.time.DayOfWeek;

public class OpeningHours {

    // time the shop opens
    private final String openingTime;
    // time the shop closes
    private final String closingTime;
    // the variation of opening hours the shop uses
    private final OpeningVariations openingVariation;


    // constructor with all the fields
    public OpeningHours(String openingTime, String closingTime, OpeningVariations openingVariation) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.openingVariation = openingVariation;
    }

    // method to determine on which day of the week a shop with a certain openingVariation would be open
    public String getOpeningHoursToday(DayOfWeek dayOfWeek) {
        // check if the opening variation the shop has chosen in Mon-Fri
        if (openingVariation.equals(OpeningVariations.MONTOFRI)) {
            // if it is a Mon-Fri shop, it will be closed on Sat and Sun but open on all other days
            if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)) {
                return " is closed today.";
            } else {
                return " is open from " + openingTime + " to " + closingTime + " today.";
            }
            // check if the opening variation the shop has chosen in Tue-Fri
        } else if (openingVariation.equals(OpeningVariations.TUETOFRI)) {
            // if it is a Mon-Fri shop, it will be closed on Mon, Sat and Sun but open on all other days
            if (dayOfWeek.equals(DayOfWeek.SUNDAY) || dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.MONDAY)) {
                return " is closed today.";
            } else {
                return " is open from " + openingTime + " to "  + closingTime + " today.";
            }
            // in case there is no opening variation defined, we would not know anything about opening hours here
        } else {
            return " does not have available opening times.";
        }
    }

}
