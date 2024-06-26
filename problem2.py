# time: O(n)
# space: O(1)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count = {0:-1}
        sumi = 0
        res = 0

        for i in range(len(nums)):
            if nums[i]==0:
                sumi-=1
            else:
                sumi+=1

            if sumi in count:
                res = max(res, i - count[sumi])
            else:
                count[sumi] = i
        
        return res

        