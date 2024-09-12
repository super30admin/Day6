class Solution:
    #O(n) time and O(n) space solution
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap = dict()
        hashmap[0] = 1
        count = 0
        rsum = 0

        for i in range(len(nums)):
            rsum += nums[i]
            if (rsum - k) in hashmap.keys():
                count += hashmap[rsum -k] 

            hashmap[rsum] = hashmap.setdefault(rsum,0) +1
        return count 
        