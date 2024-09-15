'''
We have to maintain a hashmap with prefix sum which stores the number of vals with same prefix sum.

Time: O(N)
Space: O(N)
'''

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d=defaultdict(int)
        curr_sum=0
        count=0
        for i in range(len(nums)):
            curr_sum+=nums[i]
            if(curr_sum==k):
                count+=1
            if(curr_sum-k in d):
                count+=d[curr_sum-k]
            d[curr_sum]+=1
        
        return count