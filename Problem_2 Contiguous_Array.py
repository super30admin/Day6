# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach
# Use Hashmap and the concept of Running Sum Pattern


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {}
        hashmap[0] = -1
        rsum = 0
        result = 0
        for i in range(len(nums)):
            if nums[i] == 0:        #If the value is 0 then sub 1 from running sum
                rsum -= 1
            else:
                rsum += 1           #If the value is 1 then add 1 from running sum
            if rsum in hashmap.keys():
                curr = i - hashmap[rsum]         #result = Curr index - earlier index
                result = max(curr, result)
            else:
                hashmap[rsum] = i
        return result

