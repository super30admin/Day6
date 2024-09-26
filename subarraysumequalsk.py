# running on leetcode :Yes
# runtime complexity: O(n)
# Space complexity:   O(n)


class Solution:
    def subarraySum(self, nums, k):
        d = {0:1}
        Sum = 0
        count = 0
        for n in nums:
            Sum += n
            if Sum-k in d:
                count += d[Sum-k]
            if Sum in d:
                d[Sum] += 1
            else:
                d[Sum] = 1      
        return count