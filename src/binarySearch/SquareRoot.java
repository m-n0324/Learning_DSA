package binarySearch;

public class SquareRoot {

    public int mySqrt(int x) {
        // Optimization: sqrt(0)=0, sqrt(1)=1
        if (x < 2) return x;

        int beg = 1, end = x;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square > x) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        // When the loop ends, 'end' is the floor value of the square root
        return end;
    }

    public static void main(String[] args) {
        SquareRoot solver = new SquareRoot();

        // Example 1: Perfect square
        System.out.println("sqrt(4) = " + solver.mySqrt(4));   // Output: 2

        // Example 2: Non-perfect square (rounds down)
        System.out.println("sqrt(8) = " + solver.mySqrt(8));   // Output: 2

        // Example 3: Large number
        System.out.println("sqrt(2147395600) = " + solver.mySqrt(2147395600)); // Output: 46340
    }
}