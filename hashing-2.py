# problem 1 : 560. Subarray Sum Equals K : https://leetcode.com/problems/subarray-sum-equals-k/
# Time Complexity : O(N) 
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sums = {0:1}
        count = 0
        total = 0
        for num in nums:
            total += num
            if total - k in sums:
                count += sums[total-k]
            if total in sums:
                sums[total] += 1
            else:
                sums[total] = 1

        return count  


# problem 2 : 525. Contiguous Array : https://leetcode.com/problems/contiguous-array/
# Time Complexity : O(N) 
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count = {}
        res = 0
        ct = 0
        count[0] = -1
        for i in range(len(nums)):
            if nums[i] == 0:
                ct -= 1
            else:
                ct += 1
            if ct in count:
                res = max(res, i -count[ct])
            else:
                count[ct] = i
        return res



# problem 3 : 409. Longest Palindrome : https://leetcode.com/problems/longest-palindrome/
# Time Complexity : O(N) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach
class Solution:
    def longestPalindrome(self, s: str) -> int:
        ## using hashmap
        # res = collections.Counter(s)
        # max_odd = 0
        # ans = 0
        # for value in res.values():
        #     if value % 2 == 0:
        #         ans += value
        #     else:
        #         ans += (value-1)
        #         max_odd = max(max_odd, value)
        # return ans + 1 if max_odd != 0 else ans
        
        ## using hashset
        res = set()
        ans = 0
        for ch in s:
            if ch in res:
                ans += 2
                res.remove(ch)
            else:
                res.add(ch)
        return ans + 1 if res else ans