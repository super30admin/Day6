class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        runSum=0
        d={}
        d[0]=1
        count=0
        for i in nums:
            runSum+=i
            comp=runSum-k
            if comp in d:
                count+=d[comp]
            if runSum not in d:
                d[runSum]=0
            d[runSum]+=1
        
        return count