// Time Complexity : O(N)
// Space Complexity : O(N)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

/*

We will use sum variable, count, hashmap for already seen sum-value

If map contains, current sum - k as key then we will increase the counter by the value of the hash-key (sum-k)

If map don't contains sum, then we will add key-value  pair of new sum with 1 or will increment the occurences of that sum

Return count at last
*/
class Solution3 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        int sum = 0, count = 0;
        
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;   
    }
}

// public class Problem1_SubArraySumK {
    
// }
