"""
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
1) Initialize the map that keeps track of running sum along with count of occurence in the array
2) return_val = 0
3) Iterate over the nums
    - Update the running sum
    - Check if (running sum - target) is in map
        update the return_val with map.get(running_sum - target)
    - if running sum not in map
        add rnning_sm to map with value 1
    - else
        update map[running_sum] +=1
4) Return return_val
"""

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        mp = {}
        mp[0] = 1
        ret_val = 0
        running_sm = 0
        for i in nums:
            running_sm += i
            if (running_sm - k) in mp:
                print(running_sm - k, mp)
                ret_val += mp.get(running_sm - k)
            if running_sm in mp:
                mp[running_sm]+=1
            else:
                mp[running_sm] = 1
        
        #print(mp)
        return ret_val