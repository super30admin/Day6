//The approach here is to use a hashmap to store the running sum and it's no. of occurences as key-value pairs.
//If we find the value of the difference of running sum and target already exists in the hashmap, we can add the count of it for the result of total number of subarrays with sum as target.
//Then we can add the running sum and it's occurence to the hashmap.
//Time Complexity: O(n)
//Space Complexity: O(n) where n is the length of the array.
import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int rSum = 0;
        int result = 0;
        map.put(0,1);
        for(int i = 0; i<nums.length; i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum-k)){
                result = result + map.get(rSum-k);
            }
            if(!map.containsKey(rSum)){
                map.put(rSum, 1);
            } else {
                map.put(rSum,map.get(rSum) + 1);
            }
        }
        return result;
    }
}