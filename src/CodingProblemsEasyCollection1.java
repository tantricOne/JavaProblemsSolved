public class CodingProblemsEasyCollection1 {

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

        //Test cases for sumDigits
//        System.out.println(sumDigits(1234));
//        System.out.println(sumDigits(-125));
//        System.out.println(sumDigits(4));
//        System.out.println(sumDigits(32123));

        //Test cases for isPalindrome
//        System.out.println(isPalindrome(101));
//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(11212));
//        System.out.println(isPalindrome(707));

        //Test cases for sum last and first digit
//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(257));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(-10));

        //Test cases for sum of all even digits
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(252));
//        System.out.println(getEvenDigitSum(-22));

        //Test cases for hasSharedDigit
//        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSharedDigit(9, 99));
//        System.out.println(hasSharedDigit(15, 55));
    }

    //1. Method to convert Km to miles
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
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
        if (year % 4 == 0) {
            if (year % 100 == 0) {
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
        int y = (int) (num2 * 1000);
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

    //6. Method to sum the digits in a number
    public static int sumDigits(int num) {
        if(num < 0) {
            return -1;
        }
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }
        sum += num;
        return sum;
    }

    //7. Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        if (number == 0) {
            return true;
        }
        int original = number;
        int reverse = 0;
        int lastDigit = 0;
        if(number > 0) {
            while(number > 0) {
                lastDigit = number % 10;
                reverse *= 10;
                reverse += lastDigit;
                number /= 10;
            }
        } else {
            while (number < 0) {
                lastDigit = number % 10;
                reverse *= 10;
                reverse += lastDigit;
                number /= 10;
            }
        }
        return original == reverse;
    }

    //8. Method to sum first and last digit of a number
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0 ) {
            return -1;
        }
        int lastDigit = number % 10;
        while(number > 9) {
            number /= 10;
        }
        return number + lastDigit;
    }

    //9. Method for Calculating The Sum Of All Even Digits In An Integer
    public static int getEvenDigitSum(int number) {
        if (number < 0 ) {
            return -1;
        }
        int sum = 0;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }

    //10. Method for Checking For A Shared Digit Between Two Numbers
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 >99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        num1 /= 10;
        num2 /= 10;
        return (num1 == num2 || num1 == num2LastDigit || num1LastDigit == num2 || num1LastDigit == num2LastDigit);
    }
}
