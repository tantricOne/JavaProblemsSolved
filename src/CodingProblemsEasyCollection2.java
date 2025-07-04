import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CodingProblemsEasyCollection2 {

    public static void main(String[] args) {
        //Test cases for hasSameLastDigit
//        System.out.println(hasSameLastDigit (41, 22, 71));
//        System.out.println(hasSameLastDigit (23, 32, 42));
//        System.out.println(hasSameLastDigit (9, 99, 999));

        //Test cases for printFactors
//        printFactors(6);
//        printFactors(32);
//        printFactors(10);
//        printFactors(-1);

        //Test cases for gcd
//        System.out.println(getGreatestCommonDivisor(25, 15));
//        System.out.println(getGreatestCommonDivisor(12, 30));
//        System.out.println(getGreatestCommonDivisor(9, 18));
//        System.out.println(getGreatestCommonDivisor(81, 153));

        //Test cases for isPerfectNumber
//        System.out.println(isPerfectNumber(6));
//        System.out.println(isPerfectNumber(28));
//        System.out.println(isPerfectNumber(5));
//        System.out.println(isPerfectNumber(-1));

        //Test cases for largest prime factor
//        System.out.println(getLargestPrime (21));
//        System.out.println(getLargestPrime (217));
//        System.out.println(getLargestPrime (0));
//        System.out.println(getLargestPrime (45));
//        System.out.println(getLargestPrime (-1));

        //Test case for printSquareStars
//        printSquareStar(2);
//        printSquareStar(5);
//        printSquareStar(8);

        //Test cases for 19 and 20
//        int[] testArray = getIntegers(5);
//        printArray(testArray);
//        System.out.println(Arrays.toString(sortArray(testArray)));

    }

    //11. Method for Evaluating The Last Digit For Multiple Integer Comparisons
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) ||(num3 < 10 || num3 > 1000)) {
            return false;
        }
        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;
        return (num1LastDigit == num2LastDigit) || (num2LastDigit == num3LastDigit) || (num3LastDigit == num1LastDigit);
    }

    //12. Method for Listing All Factors Of A Given Number
    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }

    //13. Method for Deriving The Greatest Common Divisor (GCD) Efficiently
    public static int getGreatestCommonDivisor (int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int gcd = 0;
        if(first < second) {
            for(int i = 1; i <= first; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    gcd = i;
                }
            }
        } else {
            for(int i = 1; i <= second; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    //14. Method for Confirming Perfect Numbers Through Sum Of Proper Divisors
    public static  boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
            if(sum == number) {
                return true;
            }
        }
        return false;
    }

    //15. Method for Identifying The Largest Prime Factor Of A Number
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int factor = 1;
        for(int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0) {
                factor = i;
                while(number % i == 0) {
                    number /= i;
                }
            }
        }
        return number == 1 ? factor : number;
    }

    //16. Method for Constructing A Diagonal Star Pattern With Loops
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || i == j || j == (number - i + 1) || j == 1 || j == number) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    //17. Method to sort array in descending order using arrays.sort
    public static int[] reverseArray(int[] array) {
        Arrays.sort(array);
        for(int i = 0; i < array.length / 2; i++ ) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length -1 - i] = temp;
        }
        return array;
    }

    //18. method to create an array filled with random numbers
    public static int[] randomArray(int len) {
        int[] array = new int[len];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    //19. Method to create an array from user input
    public static int[] getIntegers(int len) {
        int[] array = new int[len];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter array element " +i + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for( int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    //20. Method to sort array in descending order without using arrays.sort
    public static int[] sortArray(int[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

}
