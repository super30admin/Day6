import java.util.HashMap;


//Time complexity : O(n). The entire numsnums array is traversed only once.

//Space complexity : O(n). Hashmap mapmap can contain upto nn distinct entries in the worst case

//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this: no
public class SubarraySumEqualsK {
	
    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        //initialize hashmap with key as sum and value as default 1 (no of occurances of sum in hashmap)
        HashMap < Integer, Integer > map = new HashMap < > ();
        //put initial value key =0 and value =1
        map.put(0, 1);
        
        //iterate over array
        for (int i = 0; i < nums.length; i++) {
        	//addition of elements
            sum += nums[i];
            //check if map contains key  which is sum with value (sum-k). if yes the it means subarray with target sum k is found so increment counter.
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            //if new sum then store it in hashmap with initial value as 1.
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        //return count which is no of  subarray found with target sum as k
        return count;
    }    

    public static void main(String[] args) {
    	int[] nums = {1,1,1};
    	int targetSum =2;
    	int count = subarraySum(nums,targetSum);
        System.out.println("number of subarrays with targetsum="+count);	
    }
}
