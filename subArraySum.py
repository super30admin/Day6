'''
Time Complexity: O(N)
Space Complexity: O(N) //At worst case
'''
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum  = 0
        count = 0
        hashmap = {0:1}
        for i in range(len(nums)):
            rsum += nums[i]
            val = rsum - k
            if(val in hashmap):
                count += hashmap[val]
            if(rsum in hashmap):
                hashmap[rsum] += 1
            else:
                hashmap[rsum] = 1
        return count
        