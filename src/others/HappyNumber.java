package others;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        // If we hit 1, it's a happy number.
        // If we hit a number already in the set, we are in a cycle.
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = sumOfSquareOfDigits(n);
        }
        return true;
    }

    private int sumOfSquareOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            int rem = num % 10;
            result += rem * rem;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        HappyNumber solver = new HappyNumber();

        System.out.println("Is 19 happy? " + solver.isHappy(19)); // true
        System.out.println("Is 2 happy? " + solver.isHappy(2));   // false
    }
}