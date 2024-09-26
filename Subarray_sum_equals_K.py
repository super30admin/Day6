# Time Complexity:- O(n)
# Space Complexity:- O(n)
# Approach:- While calculating the running_sum of the elements, if I have seen 
# the running_sum-k before the no. of such subarrays having that sum
# will have to be added to the total number of subarrays having that sum.
# And after every iteration I make a note of the running sum I have seen till now
# and the no. of such occurences.
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sum=0
        my_set={0:1}
        res=0
        for i in range(len(nums)):
            sum+=nums[i]
            # check if running_sum-k is already seen
            if sum-k in my_set:
                res+=my_set[sum-k]
            # make a note of the running sum i am seeing right now and the no. of such occurences
            if sum in my_set:
                my_set[sum]+=1
            else:
                my_set[sum]=1    
        return res