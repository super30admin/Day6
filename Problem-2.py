"""
Approach:

The idea is to use compliment of cumulative sum/ running sum to find if a sub array is balanced or not.
1) start storing the first occurrence of cumulative total in a hashmap
2) if at an index, we see a sum that has occurred before, we can say that the compliment subarray is balanced
    a) we get the length of the sub array by subtracting the current index from first occurance index
3) notice that with this approach we'd miss the first balanced sub array if the array begins with 0,1 or 1,0
    a) or if the entire array is balanced, and use use (nth index - 0), we'd be short by one to ge the length of
    balanced array
    b) to handle this case, we need to start our hashmap with {0 : -1}. Meaning, we have an imaginary index "-1"
    at which our cumulative sum is 0
"""


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        first_occur = {0 : -1 }

        running_sum = 0
        max_ = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                running_sum -= 1
            else:
                running_sum += 1

            if running_sum not in first_occur:
                first_occur[running_sum] = i

            elif max_ < (i -  first_occur[running_sum]):
                max_ = i -  first_occur[running_sum]

                """ # follow-up question to find the complete array
                starting_index = first_occur[running_sum] + 1
                ending_index = i
    print(starting_index, ending_index)
    """
        return max_

"""
Time Complexity: O(n)
Space Complexity: O(n)
"""