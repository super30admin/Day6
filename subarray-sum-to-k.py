"""
TC:O(n)
SC:O(1)
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count=0
        hm={0:1}
        total=0
        occ=0
        for i in nums:
            total+=i
            if total-k in hm:
                occ1=hm[total-k]
                count+=occ1
            if total in hm:
                occ2=hm[total]
                occ2+=1
                hm[total]=occ2
            else:
                hm[total]=1
        return count