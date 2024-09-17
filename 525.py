// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {}
        count = 0
        max_count = 0
        hashmap[0] = -1
        for i in range(len(nums)):
            if nums[i] == 0:
                count -= 1
            else:
                count += 1
            if count in hashmap:
                max_count=max(max_count,i - hashmap[count])
            else:
                hashmap[count] = i
        return max_count
    

                