// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had difficulty in understanding the approach initially, but was able to understand later


// Your code here along with comments explaining your approach
/*Used Hashmap to store Key as cumulativeSum and value as count of cumulativeSum
 * If map contains key as cumulativeSum, then insert in to map with Key = cumulativeSum and value = count of cumulativeSum
 * If map contains key as cumulativeSum-k, then increment the total count as subarray sum
 * */


import java.util.HashMap;

public class SubarraySum {
	public static int subarraySum(int[] nums, int k) {
		if(nums == null || nums.length == 0)
			return 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();    // Key = cumulativeSum, value = count of cumulativeSum
        int cumulativeSum = 0;
        int totalCount = 0;
        
        map.put(0, 1);		// Initializing with cumulativeSum 0, and count 1
        
        for(int i=0; i<nums.length; i++) {
        	cumulativeSum+= nums[i];
        	
        	if(map.containsKey(cumulativeSum-k)) {			// if map contains a key (cumulativeSum-k), then increment the total count of subarray
        		totalCount+= map.get(cumulativeSum-k);
        	}
        	
        	if(map.containsKey(cumulativeSum)) {					// if map contains a key(cumulativeSum), then insert in map as Key = cumulativeSum, value = count of cumulativeSum
        		int countOfcumulativeSum = map.get(cumulativeSum);
        		countOfcumulativeSum++;
        		map.put(cumulativeSum, countOfcumulativeSum);
        	}
        	else
        		map.put(cumulativeSum, 1);					// else initialize the map with cumulativeSum and count of cumulativeSum as 1
        }
		return totalCount;				// return the total count of subarray
	}

	public static void main(String[] args) {
		int[] nums = {1,1,1};
		int k = 2;
		System.out.print(subarraySum(nums,k));
	}
}



/********************************Brute Force Approach O(n^3)*****************************/

/*public class SubarraySum {
	public static int subarraySum(int[] nums, int k) {
		int count =0;
		int sum = 0;
		for (int i = 0; i<nums.length; i++){
            for(int j = i+1; j<=nums.length; j++){
                for(int l = i; l<j; i++) {
                	 sum = sum + nums[l];
                }
                if(sum == k)
                	count++;
            }
		}
		return count;
	}
	public static void main(String[] args) {
		int[] nums = {1,1,1};
		int k = 2;
		System.out.print(subarraySum(nums,k));
	}
}
*/
