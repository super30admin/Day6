class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        hashmap={}
        hashmap[0]=-1
        m=0;rsum=0
        if nums is None or len(nums)==0:
            return 0
        for i in range(len(nums)):
            if nums[i]==0:
                rsum-=1
            else:
                rsum+=1

            if rsum in hashmap:
                m = max(m,i-hashmap[rsum])
            else:
                hashmap[rsum]=i


        return m
                
