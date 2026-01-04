package LeetCode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapTwoSum {
    public int[] twoSum(int[] nums,int target ){
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i =0;i< nums.length;i++){
            indexMap.put(nums[i],i);
        }
        for(int i=0;i< nums.length;i++){
            int numB = target - nums[i];
            int indexnumB = indexMap.getOrDefault(numB , -1);
            if (indexnumB != -1 && indexnumB != i){
                return new int[]{ i,indexnumB};
            }
        }
        throw new IllegalArgumentException("invalid input");
    }

    public static void main(String[] args) {
        MapTwoSum solver = new MapTwoSum();
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] result = solver.twoSum(nums,target);
        System.out.println("Indices:"+ Arrays.toString(result));

    }
}