package binarySearch;

public class SearchRotatedSortedArray {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int n = nums.length;
        int beg = 0, end = n - 1;

        // 1. Find the smallest element (pivot)
        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (nums[mid] > nums[end]) {
                beg = mid + 1;
            } else {
                end = mid;
            }
        }

        int pivot = beg;

        // 2. Shifted binary search
        beg = 0;
        end = n - 1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            // Map the mid index to the actual rotated position
            int realMid = (mid + pivot) % n;

            if (nums[realMid] == target) {
                return realMid;
            } else if (nums[realMid] < target) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SearchRotatedSortedArray solver = new SearchRotatedSortedArray();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Index of " + target + " is: " + solver.search(nums, target)); // Output: 4
    }
}