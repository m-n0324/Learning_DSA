package sorting;
/**
 Given an unsorted integer array nums and an integer k, return the
 $k^{th}$ largest element in the array. Note that it is the
 $k^{th}$ largest element in the sorted order, not the $k^{th}$ distinct
 element.
 ExampleInput: nums = [3, 2, 1, 5, 6, 4], k = 2 then output is 5
 Example 2:
 Input: nums = [3, 2, 3, 1, 2, 4, 5, 5, 6], k = 4
 Output: 4
  **/
public class KthLargestElement{
    public static void main(String[] args) {
        KthLargestElement kthLargest = new KthLargestElement();
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println("Kth Largest is:" + kthLargest.findKthLargest(nums , 4));
    }

    public int findKthLargest(int[] nums,int k){
        return quickSelect(nums,0,nums.length-1,k);
    }
    public int quickSelect(int[] nums, int beg, int end, int k){
        System.out.print(".");
        int pivot = beg;
        for(int i = pivot; i < end;i++){
            if(nums[i]<= nums[end]){
                swap(nums,i,pivot);
                pivot++;
            }
        }
        swap(nums,pivot,end);
        int count = end-pivot+1;
        if(count==k) return nums[pivot];
        if(count > k){
            return quickSelect(nums,pivot+1,end,k);
        }else{
            return quickSelect(nums,beg,pivot-1,k-count);
        }

    }
    public void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
