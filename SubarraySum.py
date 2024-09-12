# Time Complexity : O(N)

# Space Complexity : O(N) where N is the number of unique rsums generated.

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach
# I have used a HashMap where I store the global (runningsum , count) pair. For every rsum, I take the complemnt
# with the target and if compliment is present then I add its value to the global count. If not I add (rsum, 1)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums == None or len(nums) == 0:
            return -1

        rsum, count = 0, 0
        hashMap = {}
        hashMap[0] = 1

        for num in nums:
            rsum += num
            compliment = rsum - k
            if compliment in hashMap:
                count += hashMap[compliment]
            if rsum in hashMap:
                hashMap[rsum] += 1
            elif rsum not in hashMap:
                hashMap[rsum] = 1

        return count