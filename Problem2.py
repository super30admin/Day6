# Time Complexity: O(N^2) because of max function inside the for loop
# Space Complexity: O(N)
# Leetcode all test cases passed: yes
# Any difficulties: Yes, but all cleared after the lecture

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dic = {0:-1}                                    # for cases where array starts from 0
        maxlen = 0
        count = 0
        for idx, ele in enumerate(nums):
            count = count + 1 if ele == 1 else count-1  # Incrementing count if 1 and decreasing if 0
            if count not in dic:                        
                dic[count] = idx
            else:
                maxlen = max(maxlen, idx - dic[count])
        return maxlen
        
