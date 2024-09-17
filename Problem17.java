import java.util.HashMap;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 *   Running sum pattern
 *   3   4   7   2   -3  1   4   2   0   1
 *   3   7   14  16  13  14  18  20  20  21
 *   |----------y-----------------|   current runningSum y : 20
 *   |----x-----------|               running sum happened Before : y-z = x : 20-7 = 13 
 *                    |-----z-----|   target sum : z : 7
 *
 *   if the running sum happened before then definitely the sub array(z) sum is 7 
 *   
 * time: O(n)
 * space: O(n)
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        int runningSum = 0;
        int count = 0;
        
        
        for(int i = 0; i < nums.length; i++){
            runningSum += nums[i];
            int happenedBefore = runningSum - k;
            
            if(map.containsKey(happenedBefore)){
                count += map.get(happenedBefore);
            } 
            
            if(!map.containsKey(runningSum)){
                map.put(runningSum, 0);
            } 
            
            map.put(runningSum, map.get(runningSum)+1);
        }
        
        return count;
    }
}

public class Problem17 {
    public static void main(String[] args) {
        
    }
}
