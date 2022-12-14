
// Start with a positive number n
// if n is even then divide by 2
// if n is odd then multiply by 3 and add 1
// continue this until n becomes 1

// The Guthrie index of a positive number n is defined to be how many iterations of the above algorithm it takes before n
// becomes 1.
// For example, the Guthrie index of the number 7 is 16 because the following sequence is 16 numbers long.
// 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
// It is easy to see that this sequence was generated by the above algorithm. Since 7 is odd multiply by 3 and add 1 to get 22
// which is the first number of the sequence. Since 22 is even, divide by 2 to get 11 which is the second number of the
// sequence. 11 is odd so multiply by 3 and add 1 to get 34 which is the third number of the sequence and so on.
// Write a function named guthrieIndex which computes the Guthrie index of its argument.
public class gurthieIndexCheck {
    public static void main(String args[]) {
        System.out.println("the gurthie index is: " + guthrieIndex(42));

    }

    public static int guthrieIndex(int n) {
        int result = 0;

        int item = n;

        if (item == 1) {
            return 0;
        }

        while (item != 1) {
            result += 1;
            if (item % 2 == 0) {
                item = item / 2;
            } else {
                item = item * 3 + 1;
            }
        }

        return result;
    }

}
