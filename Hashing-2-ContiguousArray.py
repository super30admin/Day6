# Problem2 (https://leetcode.com/problems/contiguous-array/)

# Time Complexity: O(n) ; n = length of nums
# Space Complexity: O(n) ; max size of hashmap will be n
# Approach: Not to maintain sublist, we store running Sum and index in Hashmap. If runningSum in Hashmap, means it has 
# already occured, update Max, else add it in Hashmap. In between if runningSum = 0, means we have exact count of 0's 
# and 1's, so update max there also. Return max in the end.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums:
            return 0
        dic = {}
        runningSum = 0
        Max = 0
        # dic[0] = -1 # I get the intuition, but little confusing. If using this comment -> if runningSum == 0, loop
        for i in range(len(nums)):
            if nums[i] == 0:
                runningSum -= 1
            else:
                runningSum += 1
            if runningSum == 0:
                Max = max(Max, i+1) # Array from index 0 to i contains equal number of 0's and 1's
            if runningSum in dic.keys():
                print(i-dic[runningSum])
                Max = max(Max, i-dic[runningSum])
            else:
                dic[runningSum] = i
        return Max