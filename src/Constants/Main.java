package Constants;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /// make a new instance of the AgeCalculator
        AgeCalculator ageCalculator = new AgeCalculator();

        // make a scanner to get values to calculate
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age in years:");
        int age = scanner.nextInt();

        // show age in days/weeks/months in console
        System.out.println("Your age in days in approximately " + ageCalculator.ageInDays(age));
        System.out.println("Your age in weeks in approximately " + ageCalculator.ageInWeeks(age));
        System.out.println("Your age in months in approximately " + ageCalculator.ageInMonths(age));
    }
}
