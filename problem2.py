# Time Complexity : O(n)
# Space Complexity : O(n^2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
    # Was able to find bruteforce approach only. I have to look throught suggestion to pass all test cases on leetcode. I have included both solutions.
class Solution:
    #Brute force solution
    # def findMaxLength(self, nums: List[int]) -> int:
#         maxlength = 0
#         one = {0:0}
#         zero = {0:0}
#         for i in range(1,len(nums)+1):
#             if nums[i-1] == 0:
#                 zero[i] = zero[i - 1] + 1
#                 one[i] = one[i-1]
#             else:
#                 one[i] = one[i - 1] + 1
#                 zero[i] = zero[i-1]    
#         for i in range(len(nums)):
#             for j in range(i+1, len(nums)):
#                 totalzero = zero[j+1] - zero[i]
#                 totalone = one[j+1] - one[i]
#                 if totalzero == totalone:
#                     maxlength = max(maxlength, 2 * totalzero)
#         return maxlength

    def findMaxLength(self, nums: List[int]) -> int:
        sum = 0
        # initilizing dictionary to store the sum
        data = dict()
        maxl = 0 
        # initilizing dictionary with key zero and value -1. Sum can be zero only when we have equal number of zero and one here, and number of 1 and 0 was equal even before first element of array. So we give it value -1.
        data[0] = - 1
        for i in range(len(nums)):
            # for zero and one increase and decrease sum
            if nums[i]:
                sum -= 1
            else:
                sum += 1
                
            #  if sum exists in dictionary than we compare it with our current max and current index minus last index at which sum was same.
            if sum in data:
                maxl = max(maxl, i - data[sum])
            else:
            # for new value of sum store it in dictionary with index as value to keep track of sums index.
                data[sum] = i
        return maxl