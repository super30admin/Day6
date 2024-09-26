class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count =0
        sum1= 0
        dict1 = {}
        
        dict1[0] =1
        
        for i in range (len(nums)):
            sum1 += nums[i]
            if (sum1-k in  dict1):
                count +=dict1[sum1-k]
            dict1[sum1]= dict1.get(sum1,0)+1
            
        return count
