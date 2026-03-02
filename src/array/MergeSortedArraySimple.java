package array;
import java.util.Arrays;

public class MergeSortedArraySimple {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Step 1: Copy nums2 into the end of nums1
        // Time Complexity: O(n)
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Step 2: Sort the combined array
        // Time Complexity: O((m+n) * log(m+n))
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        MergeSortedArraySimple solver = new MergeSortedArraySimple();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solver.merge(nums1, m, nums2, n);

        System.out.println("Output is: " + Arrays.toString(nums1));
    }
}