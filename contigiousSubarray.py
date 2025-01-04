class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        # TC: O(n)
        # SC: O(n)
        # Utilised the concept of running sum based on whether the value is 0 or 1 and checks if the sum has been encountered before to calculate the subarray length.
        if nums is None or len(nums)==0 or len(nums)==1:
            return 0
        maxlen = 0
        hmap = {0:-1}
        rsum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -= 1
            elif nums[i] == 1:
                rsum += 1
            if rsum in hmap.keys():
                maxlen = max(maxlen,i-hmap[rsum])
            else:
                hmap[rsum] = i
        return maxlen
        