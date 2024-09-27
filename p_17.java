// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approachimport java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();//<Rsum , Rsum_frequency>
        map.put(0,1);
        int rSum = 0; int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)){
                count += map.get(rSum - k);
            }
            //=========================================
            int fre = 0;
            if(map.containsKey(rSum)){
                fre = map.get(rSum);
            }
            fre = fre + 1;
            map.put(rSum,fre);
            // ==== OR =================================
            // map.put(rSum, map.getOrDefault(rSum,0) + 1); // if rSum there in hashmap get it's frequency and add +1 to it or if not there than put rSum into HashMap with frequency = 0 first and then add +1 to it. 
            
        }
        return count;
    }
}