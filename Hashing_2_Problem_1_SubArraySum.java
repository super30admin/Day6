import java.util.HashMap;

//Time Complexity : O(n)
//Space Complexity : O(n) where n=length of the array
// Run Successfully on LeetCode
// Problems : Understanding the edge case : 0 sum with 1 occurrence

/*
Here we will be storing the aggregate sum mapped with its number of occurrence.
if (Sum - (value we need)) is present in the mapping, we found our subarray
 */

public class Hashing_2_Problem_1_SubArraySum {
    public static int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length == 0) return 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int rSum = 0;
        int count = 0;
        for(int i=0; i < nums.length; i++)
        {
            rSum = rSum + nums[i];
            if(hm.containsKey(rSum - k))
            {
                count += hm.get(rSum - k);
            }
            hm.put(rSum,hm.getOrDefault(rSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(subarraySum(nums,2));

    }

}
