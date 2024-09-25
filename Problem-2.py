#Approach
# Have a hash map  to store the running sum as we iterate over the list: if value is 0 add -1 else add 1
# As an edge case if running sum is 0 that means that index to start is balanced
# If running sum is find in the hash map the max of present index - start_index of same running sum.

#Complexities
# Time Complexity : O(n)
# Space Complexity: O(1)





from typing import List


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashMap = dict()

        max_length = 0

        running_sum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                running_sum += -1
            else:
                running_sum += 1

            if running_sum == 0:
                max_length = max(max_length, i + 1)
            else:
                if running_sum not in hashMap:
                    hashMap[running_sum] = i
                else:
                    max_length = max(max_length, i - hashMap[running_sum])



        return max_length



s = Solution()
print(s.findMaxLength([0,0,1,0,0,0,1,1]))
