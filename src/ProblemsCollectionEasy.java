public class ProblemsCollectionEasy {

    public static void main(String[] args) {
        //Test cases for Km to miles converter
//        System.out.println(toMilesPerHour(1.5));
//        System.out.println(toMilesPerHour(10.25));
//        System.out.println(toMilesPerHour(-5.6));
//        System.out.println(toMilesPerHour(25.42));
//        System.out.println(toMilesPerHour(75.114));

        //Test cases for isLeapYear
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));

        //Test cases for areEqualByThreeDecimalPlaces
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        //Test cases for printYearsAndDays
//        printYearsAndDays(525600);
//        printYearsAndDays(1051200);
//        printYearsAndDays(561600);

        //Test case for isPrime
//        System.out.println(isPrime(17));
//        int counter = 0;
//        for (int i = 250; i <= 350 && counter < 3; i++) {
//            if(isPrime(i)) {
//                System.out.println(i + " is a Prime Number");
//                counter++;
//            }
//        }
    }

    //1. Method to convert Km to miles
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        double toMiles = kilometersPerHour / 1.609;
        return Math.round(toMiles);
    }

    //2. Method to find if a given year is leap year
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    //3. Method to  return true if two double numbers are the same up to three decimal places
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int x = (int) (num1 * 1000);
        int  y = (int) (num2 * 1000);
        return x == y;
    }

    //4. Method to convert minutes to Years and Days
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 1440;
            long remainingDays = (minutes / 1440) % 365;
            long years = days / 365;
            System.out.println(minutes
                    + " min = "
                    + years
                    + " y and "
                    + remainingDays
                    + " d");
        }
    }

    //5. Method to verify if number is Prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
