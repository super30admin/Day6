# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self,nums,target):
        if not nums or len(nums) == 0 :
            return 0 
        rsum = 0 
        d = {0:1}
        count = 0 
        for i in range(len(nums)):
            rsum += nums[i]
            compliment = rsum - target
            if compliment in d:
                count += d[compliment]
            if rsum not in d:
                d[rsum] = 0 
            d[rsum] = d[rsum] + 1 
        return count

if __name__ == "__main__":
    s = Solution()
    nums = [1,1,1]
    target = 2 
    res = s.subarraySum(nums,target)
    print(res)