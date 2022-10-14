/*
 * Find the square root of a number without built-in functions
 * 
 */

public class squareRoot {

    public static void main(String[] args) {
        // * thought , find the number using a binary search
        System.out.println("the square root of 9 is: " + findRoot(25));

    }

    public static int binarySearch(int number) {
        int right = 0;
        int left = number;
        int result = 0;

        while (left < right) {

            int middle = (left + right) / 2;

            if (middle * middle == number) {
                return middle;
            }

            if (middle * middle > number) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return result;

    }

    public static int findRoot(int num) {
        // Newton's method
        // ToDo: find the the absolute value without abs
        // compare = (compare <= 0.0F) ? 0.0F - compare : compare;
        // float compare = (float) guess * guess - num;
        int guess = 1;

        while (0.0001 < Math.abs(guess * guess - num)) { // how close is it to the true result
            guess = (guess + num / guess) / 2; // Newton's method to get ever closer to the true value
        }

        return guess;
    }

    public static double findRoot2(int number) {
        // Proceeding to find out square root of the number
        double g1;
        double squareRoot = number / 2;
        do {
            g1 = squareRoot;
            squareRoot = (g1 + (number / g1)) / 2; // Newton's method
        } while ((g1 - squareRoot) != 0);

        return squareRoot;

    }
}