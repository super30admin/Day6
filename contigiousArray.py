# // Time Complexity :O(n) for iterating over the hashmap
# // Space Complexity : O(n) for creating a hashmap of size n;
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Was iterating using nums instead of range(length(nums)).


# // Your code here along with comments explaining your approach
# We need to find earliest occurance of unique values in the rSum
# after every new running total is added we find if there was already a total previously
# if it is uniue we add it, otherwise we compare current max with length to current index
class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
              
        hMap = {}                           # first occurance map    
        rSum = 0                            # running sum map
        length = 0                          # current max lenght
        hMap[0] = -1                        # edge case for binary

        for i in range(len(nums)):
            if nums[i]==0:                  # 0 -> -1 and 1 -> +1
                rSum -= 1
            else:
                rSum += 1

            if rSum in hMap:                        # if rSum exists in hashmap
                length = max(length, i-hMap[rSum])  # compare current maxLength with hMap[rSum] from current index
            else:
                hMap[rSum] = i                      # add if doesnt exist
        return length
    
arr = [ 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1]
x = Solution().findMaxLength(arr)
print(x)

# Input: nums =  [ 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1]
# Rsum        = 0[-1, 0,-1, 0, 1, 2,-1, 0, 1, 2, 3, 4]