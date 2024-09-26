class Solution:#time O(n) Space O(n)
    def subarraySum(self, nums: List[int], k: int) -> int:
        dic={}
        dic[0]=1
        c=0
        s=0
        for i in range(len(nums)):
            s+=nums[i]
            if s-k in dic:
                c+=dic[s-k]
            if s not in dic:
                dic[s]=0
            dic[s]+=1
        return c
