import java.util.HashMap;

public class Subarray_sums_equals_K {
	//Approach: Here we are using the intuition, if the cumulative sum, [say sum[i] upto ith index], upto two indices is same, 
	//then we can say as the sum of elements lying in between the indices is zero.
	//2. Here if the cumulative sum upto 2 indices say i and j is at a difference of K, then sum[i] - sum[j] = K.
	//3. We store the unique cumulative sums in map, when we encounter sum - k in map we increase the count of sub array and finally return it.
	 public int subarraySum(int[] nums, int k) {
	        //hashmap to store cumulative sum
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int sum =0; int count = 0;
	        map.put(0,1); // since we calculate sum -k, we are considering sum after that index, we put map.put(0,1)
	        //when we encounter sum-k for the first time, it'll be 0.
	        //Ex. nums={1,2,3} , k=3. When we reach index 1, our sum will be equal to 3 and sum-k =0, which we'll look in the map.
	        for(int loop = 0;loop< nums.length;loop++)
	        {
	            sum += nums[loop];
	            if(map.containsKey(sum - k))
	            {
	                count += map.get(sum-k);
	            }
	            if(map.containsKey(sum))
	            {
	                int value = map.get(sum);
	                value++;
	                map.put(sum, value);
	            }else
	                map.put(sum, 1);
	        }
	        return count;
	    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :
