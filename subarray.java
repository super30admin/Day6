// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach:I used a HashMap to store the running sum rSum as a key and its frequency as a value,
 //taking advantage of its O(1) lookup time. Since we need to find subarrays with a sum equal to k, 
 //we keep adding the running sum to the HashMap while traversing the array. If we find that rSum - k already exists in the HashMap,
 // it means there is a subarray whose sum is k. This works because if rSum = 14 and we need k = 7,
 // then rSum - k = 7, meaning there was a previous sum y = 7 that allows us to form the required subarray. 
 //Before updating the frequency of rSum in the HashMap, we add the count of rSum - k to the total subarrays. 
 //this approach helps efficiently count the required subarrays while iterating through the array.

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sMap=new HashMap<>();
        int rSum=0;
        int result =0;
        sMap.put(0,1);
        for(int i=0;i<nums.length;i++){
            rSum += nums[i];
            if(sMap.containsKey(rSum-k)){
             result += sMap.get(rSum-k);
            }
            if(sMap.containsKey(rSum)){
              sMap.put(rSum,sMap.get(rSum)+1);
            }else{
                 sMap.put(rSum,1);
            }
        }
       return result; 
    }
}