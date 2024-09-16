# https://leetcode.com/problems/subarray-sum-equals-k
# // Time Complexity : o(n)
# // Space Complexity : o(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : got confused in case k==0, realized I need to increase count first then add the new element in hash
#

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hm = dict()
        hm[0] = 1
        sum1 = []
        seed = 0
        count = 0

        for num in nums:
            temp = seed + num
            sum1.append(temp)
            seed = temp
        for i in range(len(sum1)):

            if sum1[i] - k in hm:
                count += hm[sum1[i] - k]

            if sum1[i] not in hm:
                hm[sum1[i]] = 1
            else:
                hm[sum1[i]] += 1
        return count
