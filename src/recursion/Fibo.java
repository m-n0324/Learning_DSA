package recursion;

public class Fibo {


    public int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Iterative: Optimal O(n) performance
    public int fibIterative(int n) {
        if (n <= 1) return n;
        int first = 0, second = 1;
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static void main(String[] args) {
        Fibo solver = new Fibo();
        System.out.println("F(10) iterative: " + solver.fibIterative(10)); // 55
        System.out.println("F(10) recursive: " + solver.fibRecursive(10)); // 55
        System.out.println("F(2) iterative: " + solver.fibIterative(2)); // 1
        System.out.println("F(4) recursive: " + solver.fibRecursive(4)); // 3
    }
}