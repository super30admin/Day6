class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        # Time complexity O(N)
        # Space complexity O(N)
        prefix_sum = [0]
        summ = 0
        for num in nums:
            if num == 0:
                summ -= 1
            elif num == 1:
                summ += 1
            prefix_sum.append(summ)
        print(prefix_sum)
        sum_map = {0: 0}
        output = 0
        for i, val in enumerate(prefix_sum):
            if val in sum_map:
                output = max(output, i - sum_map[val])
            else:
                sum_map[val] = i
        return output