package binarySearch;
/**
 * implement Binary Search on sorted array
 * Example:
 * sortedArr: -8, -5, 0, 3, 7, 11, 15
 * Number to find: 7
 * Number to find: 1
 */
class BinarySearch {
    public int search(int[] sortedArr, int target) {
        int beg = 0, end = sortedArr.length - 1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (target == sortedArr[mid]) {
                return mid;
            } else if (target < sortedArr[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] sortedArr = {-8, -5, 0, 3, 7, 11, 15};

        // Test Case 1: Number exists
        int target1 = 7;
        int result1 = bs.search(sortedArr, target1);
        System.out.println("Target " + target1 + " found at index: " + result1);

        // Test Case 2: Number does not exist
        int target2 = 1;
        int result2 = bs.search(sortedArr, target2);
        System.out.println("Target " + target2 + " found at index: " + result2);
    }
}