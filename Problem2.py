

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach



class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = dict()
        hashmap[0] = -1
        runningsum = 0
        val = 0
        maxlen = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                runningsum = runningsum - 1
            else:
                runningsum = runningsum + 1
            if runningsum in hashmap.keys():
                val = i - hashmap[runningsum]
            else:
                hashmap[runningsum] = i

            maxlen = max(maxlen,val)
        return maxlen
