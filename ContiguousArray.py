
# // Time Complexity : O(n)
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : I faced the issues while understanding the if condition of equal nos of 1s and 0s.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dicti = {}
        dicti[0] =  -1  
        maxi = 0
        runi = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                runi -= 1
            else:
                runi += 1

            if runi in dicti:
                maxi = max(maxi, i - dicti[runi])
            else:
                dicti[runi] = i

        return maxi        
#     Approach:
#     1. Initialize a dictionary with key as 0 and value as -1. This is 
# because we want to find the first index where the sum of 1's and 0's
# is 0. So, we will store the index of the first 0 in the dictionary.
# 2. Initialize a variable runi to store the running sum of 1's and 0's
# 3. Iterate through the array and for each element, if it is 0, subtract 1
# from runi, else add 1 to runi.
# 4. Check if runi is present in the dictionary. If it is, then update maxi
# with the maximum of maxi and i - dicti[runi]. This is because we want to    
# find the maximum length of the subarray with equal number of 1's and 0's. This condition will give equal nos of 1 and 0.
# 5. If runi is not present in the dictionary, then add it to the dictionary
# with the current index as the value.
# 6. return max value