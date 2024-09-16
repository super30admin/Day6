

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach




class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 1:
            if nums[0]==k:
                return 1
            else:
                return 0

        runningsum = 0
        number = 0
        hashmap = dict()
        hashmap[0] = 1
        for i in range(len(nums)):
            runningsum = runningsum + nums[i]
            if (runningsum - k) in hashmap.keys():
                number = number + hashmap[runningsum - k]
            if runningsum in hashmap.keys():
                hashmap[runningsum] += 1
            else:
                hashmap[runningsum] = 1


        return number
