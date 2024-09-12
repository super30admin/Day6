// Time complexity: O(n^3)
// Space Complexity: O(1)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        arr_len = len( nums )
        for start in range( arr_len ):
            for end in range( start, arr_len+1 ):
                sum = 0
                for i in range( start, end ):
                  sum += nums[i]
                if sum == k:
                    count += 1
        return count
