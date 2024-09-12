# Time: O(N) | Space: O(N)

class Solution(object):
    def subarraySum(self, nums, k):
        count = 0
        sums = 0
        d = {0:1}

        for i in range(len(nums)):
            sums += nums[i]
            count += d.get(sums - k, 0)
            d[sums] = d.get(sums, 0) + 1

        return (count)


if __name__ == "__main__":
    # print(Solution().subarraySum([1,1,1], 2))
    print(Solution().subarraySum([1,2,3], 3))