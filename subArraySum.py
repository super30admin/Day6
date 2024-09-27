#Did it run on LC? Yes
#TC: O(N)
#SC: O(N)

class Solution(object):
    def subArraySum(self, nums, k):
        if not nums or len(nums) == 0:
            return 0
        h = {0:1}
        rSum = 0
        count = 0
        for num in nums:
            rSum += num
            if rSum - k in h:
                count += h[rSum - k]
            if rSum not in h:
                h[rSum] = 1
            else:
                h[rSum] += 1
        return count

if __name__ == "__main__":
    sa = Solution()
    res = sa.subArraySum([0,3], 3)
    print(res)
            
        