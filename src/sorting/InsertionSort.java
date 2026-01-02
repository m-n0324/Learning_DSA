package sorting;
public class InsertionSort implements SortingAlgos {
    @Override
    public void sort (int[]nums){
        for(int i =1;i< nums.length;i++){
            int key = nums[i];
            int j =i-1;
            while (j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
            System.out.print("Step " + i + ": ");
            printArray(nums);
        }

    }

    public static void main(String[] args) {
        int[] nums = {8, 6, 144, 77, 1, 13};
        SortingAlgos sortingAlgos;
        sortingAlgos = new InsertionSort();
        System.out.println("Original Array: ");
        printArray(nums);
        System.out.println("-----------------");

        sortingAlgos.sort(nums);

        System.out.println("-----------------");
        System.out.println("Final Sorted Array:");
        printArray(nums);
    }
    private static void printArray(int[] nums){
        for (int num:nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}