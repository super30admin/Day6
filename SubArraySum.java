// Time Complexity : O(N) - N is size of the array
// Space Complexity : O(N) - as we use a HashMap to store elements and to lookup
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int subarraySum(int[] nums, int k) {
        int currsum = 0,count = 0;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            currsum += nums[i];
            if(currsum == k) count++;
            if(map1.containsKey(currsum - k)){
                count = count + map1.get(currsum - k);
            }
            map1.put(currsum,map1.getOrDefault(currsum,0) + 1);
            
        }
        return count;
    }
}

// Your code here along with comments explaining your approach
