# Time Complexity : O(N)

# Space Complexity : O(N) where N is the number of unique rsums generated.

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach
# I have used a HashMap where I store the global (runningsum , index) pair. If I encounter 0 I add -1 to the rsum
# and on encountering 1 add 1 to the rsum. If rsum is present, length = index - hashmap[rsum]. The desired
# answer is max(length)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0

        hashMap = {}
        hashMap[0] = -1

        rsum = 0
        maxLength = 0

        for i, num in enumerate(nums):
            rsum += 1 if num == 1 else -1
            if rsum in hashMap:
                count = i - hashMap[rsum]
                if count > maxLength:
                    maxLength = count
            else:
                hashMap[rsum] = i

        return maxLength
