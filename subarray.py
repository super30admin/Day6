#Time Complexity : O(n) has nums is traversed once
#Space Complexity : O(n) has we are using hashmap and running sum can be different for item in nums
#did your code run on leetcode : yes
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        subarrays  = {0:1}
        
        rsum = 0
        result = 0
        
        for i in range(len(nums)):
            rsum += nums[i]
            
            #rsum - k exist in subarrays then we add its count to the result
            if rsum - k in subarrays.keys():
                result += subarrays[rsum - k]
            #rsum in nopt in subarrays then we add it
            if rsum not in subarrays.keys():
                subarrays[rsum] = 0
            
            temp = subarrays[rsum] + 1
            subarrays[rsum] = temp
            
        return result
