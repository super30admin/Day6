# Time Complexity : O(n) n is the length of nums array
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I maintained a cursum where  cursum at each index. Here I used a dictionary where I stored my cursum, If I already contains the cursum-k in the dict, 
#then from that point to current position I have sum equal to k. So I can add the res and dict[cursum-k].
# Then I will store my cursum in the dict or I will increment by 1 if it is already in the dict.




class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d= {0:1}
        cursum = 0
        res = 0
        for i in range(len(nums)):
            cursum += nums[i]
            if cursum-k in d:
                res +=d[cursum-k]
            
            if cursum not in d:
                d[cursum] = 1
            else:
                d[cursum] = d[cursum] +1
                
        return res