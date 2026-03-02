package array;



import java.util.Arrays;

public class MergeSortedArrayOptimal {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last valid element in nums1
        int j = n - 1; // Last element in nums2
        int k = nums1.length - 1; // Last index of nums1 total capacity

        // We only need to loop while there are elements in nums2 to merge
        while (j >= 0) {
            // If nums1 still has elements and its current element is larger
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                // Otherwise, take the element from nums2
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArrayOptimal solver = new MergeSortedArrayOptimal();

        // Test Case
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solver.merge(nums1, m, nums2, n);

        System.out.println("Merged result: " + Arrays.toString(nums1));
    }
}