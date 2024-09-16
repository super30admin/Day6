# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : YEs, was not able to understand prefix sum implemetation
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        dict1={}
        count=0
        sum=0
  
        for i in range(len(nums)):
            sum+=nums[i]
      
            if sum == k:
                count +=1
            if sum - k in dict1.keys() :
                count += dict1[sum - k]
            if sum in dict1:
                dict1[sum]+=1
            else:
                dict1[sum]=1
        return count