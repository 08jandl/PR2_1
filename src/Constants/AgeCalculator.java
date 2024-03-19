package Constants;

public class AgeCalculator {
    // 3 constants (like fields)
    static final int DAYS_IN_A_YEAR = 365;
    static final int WEEKS_IN_A_YEAR = 52;
    static final int MONTHS_IN_A_YEAR = 12;

    // methods to calculate how old in days/weeks months somebody is with the help of the constants defined above
    public int ageInDays (int age) {
        return age * DAYS_IN_A_YEAR;
    }

    public int ageInWeeks (int age) {
        return age * WEEKS_IN_A_YEAR;
    }

    public  int ageInMonths (int age) {
        return age * MONTHS_IN_A_YEAR;
    }
}
