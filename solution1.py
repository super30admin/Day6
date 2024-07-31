# Time: O(n)
# Space: O(n)

class Solution(object):
    def subarraySum(self, nums, k):
        # get running sum at each index
        # traverse the running sum array and store the unique running sums and its freq in hash map
        # if a runnning sum - k is seen as a running sum n the past then increase counter by 1
        rsum = []
        rs,cnt = 0, 0
        hmap = {}
        hmap[0] = 1
        for n in nums:
            rs += n
            rsum.append(rs)
        for rs in rsum:
            if rs - k in hmap:
                cnt += hmap[rs-k]
            if rs not in hmap:
                hmap[rs] = 1
            else:
                hmap[rs] += 1
        return cnt