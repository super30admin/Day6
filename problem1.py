# time : O(n)
#  space : O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = {0:1}
        res = 0
        currsum = 0

        for i in range(len(nums)):
            currsum+=nums[i]

            if currsum-k in count:
                res+= count[currsum-k]

            if currsum in count:
                count[currsum]+=1
            else:
                count[currsum] = 1
        
        return res
            
