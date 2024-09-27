#Did it run on LC: Yes
#TC: O(N)
#SC: O(N)

class Solution(object):
    def contiguousArray(self,nums):
        if not nums or len(nums) == 0:
            return 0
        h = {0:-1}
        rSum = 0
        max_len = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                rSum += 1
            else:
                rSum -= 1
            if rSum not in h:
                h[rSum] = i
            else:
                if (i - h[rSum]) > max_len:
                    max_len = (i - h[rSum])
        return max_len

if __name__ == "__main__":
    ca = Solution()
    res = ca.contiguousArray([1,0])
    print(res)        