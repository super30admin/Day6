class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # TC: O(n)
        # SC: O(n) bcoz of hashmap
        if nums is None or len(nums) == 0:
            return 0
        ct = 0
        hmap = {0:1}
        rsum = 0
        for num in nums:
            rsum += num
            diff = rsum-k
            if diff in hmap.keys():
                ct += hmap[diff]
            if rsum not in hmap.keys():
                hmap[rsum] = 1
            else:
                hmap[rsum] += 1
            
        return ct
        