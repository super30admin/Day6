#Time Complexity:O(1)
# Space Complexity: O(n)
def subarraySum(self, nums: List[int], k: int) -> int:
        hm={0:1}
        count=0
        rsum=0
        for i in range(len(nums)):
            rsum=rsum+nums[i]
            if rsum-k in hm:
                count=count+hm[rsum-k]
            if rsum in hm:
                hm[rsum]+=1
            else:
                hm[rsum]=1
        return count