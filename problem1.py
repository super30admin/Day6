'''
560. Subarray Sum Equals K

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)
LEETCODE: yes
DIFFICULTIES: nope, anyways, I solved it after the class.
'''


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        cnt = 0
        m = {0:1}
        rsum = 0
        for num in nums:
            rsum += num
            t = rsum-k
            if t in m:
                cnt += m[t]
            if rsum in m:
                m[rsum] += 1
            else:
                m[rsum] = 1
        return cnt
                
