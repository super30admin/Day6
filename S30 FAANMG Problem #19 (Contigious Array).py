# time complexity = O(n)
# space Complexity = O(N)
# All test cases passed in Leetcode

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {0:-1}
        max_length = 0
        count = 0
        for index in range(len(nums)):
            if nums[index] == 1:
                count += 1
            else:
                count -= 1
            if count in hashmap:
                max_length = max(max_length, index - hashmap[count])
            else:
                hashmap[count] = index
        return max_length
    