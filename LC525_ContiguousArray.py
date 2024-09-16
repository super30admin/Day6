
"""
Longest contiguous balanced subarray of 1 and 0 - should have same number of 0 and 1
Brute force -
we will form subarrays from each element - O(n*n)
and store all of them,
then go through all to find the sub array with equal number of 1 and 0

Optimization - reduce nested iterations as it is O(n*n)

We can store runnin sum at every point such that
for 0 we add -1 and for 1 we add 1 - Total sum = 0 => array is balanced array

We maintain running sum at every element - between any 2 elements where the running same is equal, there will be a balanced array
 [1,1,1,1,1,1,1,1,1]
 ^________^
     a
 ^________________^
         c
          ^_______^
              c-a      // we dont have to calculate again


We store the earliest index of all running sums in a dictionary and as we proceed ahead, we keep a track of lengths of subarrays 

Inorder to take care of initial running sum by setting running sum for index 0 as -1

Time Complexity -  O(n)
Space complexity - O(n) 

"""


from re import L


class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        dict_rsum = {0:-1}
        max_length = 0
        r_sum = 0


        for i in range(len(nums)):
            if(nums[i]==0):
                r_sum -=1
            else:
                r_sum +=1
            
            if r_sum not in dict_rsum:
                dict_rsum[r_sum]= i
            else :
                max_length = max(max_length, i- dict_rsum[r_sum])
        return max_length

nums = [1,0,1.1,1,0,0,0]
object = Solution()
ans = object.findMaxLength( nums)
print(ans)






        