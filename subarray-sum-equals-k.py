# Time : O(n) 
# Space: O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rSum = 0
        sum_dict = {0: 1}
        count = 0
        for n in nums:
            rSum = rSum + n
            if rSum - k in sum_dict:
                count += sum_dict[rSum - k]
            sum_dict[rSum] = sum_dict[rSum] + 1 if rSum in sum_dict else 1
        return count