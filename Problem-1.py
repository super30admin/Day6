#Approach
# Have a hash map  to thr store the running sum as we iterate over the list
# if rsum - target is present in the array increase th count and as an edge case add ruunig sum of zero in hashmap

#Complexities
# Time Complexity : O(n)
# Space Complexity: O(1)

from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashMap = dict()
        result = 0

        rsum = 0
        hashMap[0] = 1
        for i in range(len(nums)):
            rsum += nums[i]
            rem_sum = rsum -k
            if rem_sum in hashMap:
                result += hashMap[rem_sum]


            if rsum in hashMap:
                hashMap[rsum] += 1
            else:
                hashMap[rsum] = 1

        return result

s = Solution()
print(s.subarraySum([1,2,1,2,1],3))