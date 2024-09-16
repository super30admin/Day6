#Time Complexity=O(n)
#Space Complexity=O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        h={}
        h[0]=1
        count=0
        sum=0
        for i in range(len(nums)):
            sum=sum+nums[i]
            rem=sum-k
            if rem in h.keys(): 
                count=count+h[rem]
            if sum in h.keys():
                h[sum]=h[sum]+1
            else:
                h[sum]=1
        return count