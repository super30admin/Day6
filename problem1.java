// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Calculate the running sum and store it in hashmap if the running sum -k
//  exist in hashmap increase the count of result


import java.util.HashMap;

public class problem1 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int runSum = 0;
        int result = 0;
        for(int i=0; i<n; i++){
            runSum += nums[i];
            if(map.containsKey(runSum - k)){
                result += map.get(runSum - k);
            }
            if(!map.containsKey(runSum)){
                map.put(runSum, 1);
            }else{
                map.put(runSum, map.get(runSum)+1);
            }
        }
        return result;
    }
}
