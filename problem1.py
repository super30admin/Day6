# Time Complexity : O(n)
# Space Complexity:o(n)
#  Did this code successfully run on Leetcode : Yes

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        maxSum = 0
        rsum = 0
        hashMap = {0: 1}

        for i in range(0, len(nums)):
            rsum = int(rsum + nums[i])
            print(nums[i], rsum)
            if rsum - k in hashMap:
                # get the index and add:
                maxSum = maxSum + int(hashMap[rsum - k])

            if rsum in hashMap:
                hashMap[rsum] = int(hashMap[rsum]) + 1
            else:
                hashMap[rsum] = 1

        return maxSum

