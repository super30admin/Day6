# time complexity: O(n)
# space complexity: O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefixMap = {0:1}  # prefixSum : freq
        count = 0
        prefixSum = 0
        for num in nums:
            prefixSum += num
            cmp = prefixSum - k
            if cmp in prefixMap:
                count += prefixMap[cmp]
            # prefixMap[prefixSum] = prefixMap.get(prefixSum, 0) + 1
            # or
            if prefixSum in prefixMap:
                prefixMap[prefixSum] += 1
            else:
                prefixMap[prefixSum] = 1
        return count