#O(n) time and O(n) space where n is length of nums array
# passed all test cases
class Solution:
    def findMaxLength(self, nums):
        indices = {0:-1}
        count = 0
        max_len = 0
        for i in range(len(nums)):
            count = count + 1 if nums[i] == 1 else count - 1
            if count in indices:
                max_len = max(max_len,i - indices[count])
            else:
                indices[count] = i
        return max_len

s = Solution()
print(s.findMaxLength([0,1,1,0,1,1,1,0]))
