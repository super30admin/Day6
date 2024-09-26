#Time Complexity: O(n)
#Space Complexity: O(n)
#Successfully ran on leetcode

class Solution:
    def subarraySum(self, nums: list(int), k: int) -> int:
        d = {}
        count = 0
        rSum = [0]
        for i in range(len(nums)):
            rSum.append(rSum[i]+nums[i])
        for i in rSum:
            if i-k in d:
                count+=d[i-k] 
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        return count