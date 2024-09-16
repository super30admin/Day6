#Time complexity: O(n)
#Space complexity: O(n)
class Solution:
    def subarraySum(self, nums, k: int) -> int:
        dict1={0:1}
        r_sum=0
        count=0
        for i in range(len(nums)):
            r_sum+=nums[i]
            if r_sum-k in dict1:
                count+=dict1[r_sum-k]
            if r_sum in dict1:
                dict1[r_sum]+=1
            else:
                dict1[r_sum]=1            
        return count