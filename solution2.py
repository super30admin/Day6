# Time: O(n)
# Space: O(n)


class Solution(object):
    def findMaxLength(self, nums):
        # consider 0 as -1 and hence the array in which the rsum is same across ends is counted
        # save rsum : earliest idx where it was found
        # to get the longest arrat- just subrtract indices and store maxLen
        hmap = {}
        rsum = []
        rs, maxLen, currLen = 0, 0, 0
        # to handle the corner case of counting the first sub-arr correctly
        hmap[0] = -1
        for n in nums:
            if n == 0:
                rs -= 1
            else:
                rs += 1
            rsum.append(rs)
        
        for r in range(len(rsum)):
            rs = rsum[r]
            if rs in hmap:
                currLen = r - hmap[rs]
                maxLen = max(maxLen, currLen)
            else:
                hmap[rs] = r
        return maxLen