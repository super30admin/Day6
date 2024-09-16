"""
TC:O(n)
SC:O(1)
"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        sd={0:-1}
        total=0
        length=0
        pos_max=0
        for i in range(len(nums)):
            if nums[i]==0:
                total-=1
            else:
                total+=1

            if total in sd:
                pos_max = i - sd[total]
            else:
                sd[total]=i

            if length < pos_max:
                length = pos_max

        return length