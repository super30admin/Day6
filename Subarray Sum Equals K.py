class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        s = 0
        d = {0:1}
        count = 0
        for i in range(len(nums)):
            s+=nums[i]
            temp = s-k
            #print(d[0])
            if(temp in d):
                count+=d[temp]
            if(s in d):
                d[s] = d[s]+1
            else:
                d[s] = 1
        return count
            