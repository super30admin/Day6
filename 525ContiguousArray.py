# Time Complexity = O(n), Space Complexity = O(n) to store running sum values in a Hash map.
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        result = 0
        map1 = {0:-1}
        run_sum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                run_sum -= 1
            else:
                run_sum += 1
            if run_sum not in map1:
                map1[run_sum] = i
            diff = i - map1[run_sum]
            if diff > result:
                result = diff
        return result