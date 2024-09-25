# 560. Subarray Sum Equals K
#running sum/ prefix Sum
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hash_map = {}
        count = 0
        rSum = 0

        hash_map[0] = 1
        for n in nums:
            rSum += n
            diff = rSum - k

            if diff in hash_map:
                count += hash_map[diff]
            
            hash_map[rSum] = hash_map.get(rSum,0) + 1
        return count
        