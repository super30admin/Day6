// Time Complexity : O(n) going over the nums array
// Space Complexity : O(n) as using a hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Store the running sum and the number of times the running sum has been encountered
while going over the nums array. If the running sum - target is equal to a running sum, it implies that the running sum has been seen before
and a subarray has been spotted. Get the frequency and add it to the count.
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0,count =0;
        HashMap<Integer, Integer> store = new HashMap<Integer, Integer>(){{put(0,1);}};
        for(int i =0; i<nums.length;i++){
            sum+=nums[i];                       // Running sum
            int compliment = sum - k;               
            if(store.containsKey(compliment)){              // Whether the compliment has occured before
                count+=store.get(compliment);               // If yes, how many times it has occured before is the number of subarrays == k
            }
            store.put(sum, store.getOrDefault(sum, 0)+1);
            }
            return count;
        }
}
