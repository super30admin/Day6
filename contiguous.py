# The code defines a findMaxLength method to find the maximum length of a contiguous subarray with an equal number of 0s and 1s in a binary array.
# The approach uses a variable 'count' to track the difference between the number of 1s and 0s encountered while iterating through the array.
# 
# In each iteration:
#   - If nums[i] is 1, 'count' is incremented by 1.
#   - If nums[i] is 0, 'count' is decremented by 1.
#   - The countToIndex dictionary stores the first occurrence of each 'count' value:
#       - If 'count' is already in countToIndex, it means a subarray with an equal number of 0s and 1s exists between the stored index and the current index.
#       - The length of this subarray is calculated as (i - countToIndex[count]), and 'mx' is updated with the maximum length found so far.
#       - If 'count' is not in countToIndex, it is added with the current index, marking the first occurrence of this count.
# 
# After the loop, 'mx' contains the length of the longest subarray with equal 0s and 1s, which is returned as the result.
# 
# TC: O(n) - The time complexity is linear as each element is processed once.
# SC: O(n) - The space complexity is linear due to the dictionary storing count values and their first occurrence indices.


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
       
        mx=0
        count=0 
        countToIndex = {0:-1} 
        for i in range(len(nums)):
            if nums[i] == 1 : 
                count +=1
            else: 
                count -=1
            if count in countToIndex:
                mx=max(mx, i-countToIndex[count])
            else:
                countToIndex[count] = i
        return mx        