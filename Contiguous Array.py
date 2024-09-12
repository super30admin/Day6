# Time: O(N) | Space: O(N)


class Solution:
    def findMaxLength(self, nums):
        rsum = 0
        rsum_map = {
            0: -1
        }
        max_len = 0
        for i in range(len(nums)):
            p = -1
            if nums[i] == 1:
                p = 1
            rsum += p

            if rsum in rsum_map:
                max_len = max(max_len, i - rsum_map[rsum])
            else:
                rsum_map[rsum] = i

        return max_len




if __name__ == "__main__":
    # print(Solution().findMaxLength([1, 0,0,0,1,1,1]))
    print(Solution().findMaxLength([0, 0, 1, 0, 0, 0, 1, 1]))
