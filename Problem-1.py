# T.C = O(n) S.C = O(n)
# Found the running sum and subtract it from the target k if the answer is present in the hashmap increase count by 1 else add that key and value to the hashmap for further reference
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        if(nums == 0 or len(nums) == 0):
            return -1

        hashMap = {0:1}   # rSum:count
        count = 0
        rSum = 0

        for i in range (len(nums)):
            rSum += nums[i]

            cpm = rSum - k

            if cpm in hashMap:
                count += hashMap[cpm]
            hashMap[rSum] = hashMap.get(rSum,0) + 1

        return count
        