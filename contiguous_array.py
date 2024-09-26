# Did this code successfully run on Leetcode : YES

# Any issues faced: YES, had to refer the solution

# figured out overall approach quite close to solution

# TC: O(n), one iteration over nums
# SC: O(n), storing worst case n elements in hashmap

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {0: -1}
        cnt = 0
        maxlen = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                cnt -= 1
            else:
                cnt += 1
            if cnt in hashmap:
                maxlen = max(maxlen, i - hashmap[cnt])
            else:
                hashmap[cnt] = i
        return maxlen