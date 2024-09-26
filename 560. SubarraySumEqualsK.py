class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 0:
            return 0
        dict_nums = {}
        rsum = 0 
        count = 0 
        dict_nums[0] = 1
        for i in range(len(nums)):
            rsum += nums[i]
        
            r = rsum-k
            if r in dict_nums:
                count += dict_nums[r]
            if rsum not in dict_nums:
                dict_nums[rsum] = 1
            else:
                dict_nums[rsum] += 1
        return count

# Time complexity: O(N)
# space Complexity: O(N)